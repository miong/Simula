/**
 * *******************************************************
 * Simula
 *
 * test2.scala
 * (c)Simula on 30 oct. 2013 11:19:05
 * By Scarpe
 * Update 30 oct. 2013 11:19:05
 * *******************************************************
 */
/**
 * @author Scarpe
 *
 */
package main.scala.simula.model.city

import Array._
import main.scala.simula.common._
import main.scala.simula.common.GroundType._

class Map(s: Size) extends Viewable {
  var size: Size = s
  //Ajout pour coller avec diagramme de classe
  var value = new EconomicEvaluation
  var polution = new Polution
  var criminality = new Criminality
  var population: Population = new Population()
  var tab = ofDim[Cell](s.length, s.width)
  for (a <- 0 until s.length) {
    for (b <- 0 until s.width) {
      tab(a)(b) = new Cell(new Location(a, b), getRandomBaseType())
    }
  }

  def getRandomBaseType(): GroundType = {
    val n = (Math.random() * GroundType.size).toInt
    n match {
      case 0 => return GroundType.WATER
      case 1 => return GroundType.TREE
      case 2 => return GroundType.GRASS
      case 3 => return GroundType.STONE
      case _ => return GroundType.EARTH
    }
  }

//  /**
//   * TODO expliquer ce code
//   */
//  def constructInfrastructure(i: Infrastructure) {
//    for (a <- i.topCornerLocation.x until i.topCornerLocation.x + i.size.length) {
//      for (b <- i.topCornerLocation.y until i.topCornerLocation.y + i.size.width) {
//        tab(a)(b).addInfrastructure(i);
//      }
//    }
//  }
  /*
	def getNumberOfCitizens:Int={
	  return population.getNumberOfCitizens();
	}
	*/
  def view: String = {
    return "Map lenght:" + s.length + " width" + s.width
  }

  def getSize(): Size = {
    return size
  }
  def getLocation(): Location = {
    return new Location(0, 0)
  }
  def priority(): Integer = {
    return 0
  }

  //Ajout pour coller avec diagramme de classe
  def positionAnInfrastructure(i: Infrastructure) = {
    for (a <- i.topCornerLocation.x until i.topCornerLocation.x + i.size.length) {
      for (b <- i.topCornerLocation.y until i.topCornerLocation.y + i.size.width) {
        getCellAt(new Location(a,b)).addInfrastructure(i);
      }
    }
  }

  def getCellAt(l: Location): Cell = {
    if(l.x >= size.length || l.y >= size.width || l.x < 0 || l.y < 0){
      val fairyCell = new Cell(l,FAIRY)
      fairyCell.addInfrastructure(new WonderLand(l))
      return fairyCell
    }
    return tab(l.x)(l.y)
  }

  def destroyAt(l:Location) :Boolean = {
    var cell = getCellAt(l);
    if(cell.getType == FAIRY)
      return false
    if(cell.infrastructures.isEmpty && (cell.getType == TREE || cell.getType == STONE)){
      cell.baseType = EARTH
      return true
    }
    if(!cell.infrastructures.isEmpty){
    	for(inf <- cell.infrastructures){
    		val s = inf.getSize
    		val top = inf.getLocation
    	  for(a <- 0 until s.length ; b <- 0 until s.width){
    	    var tmp = getCellAt(new Location(top.x + a,top.y + b))
    	    tmp.infrastructures = tmp.infrastructures.empty
    	  }
    	}
    	return true
    }
    return false
  }
  
  
}