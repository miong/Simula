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
import main.scala.simula.model.city.EnumBase._

class Map(s: Size) extends Viewable {
  var size: Size = s
  //Ajout pour coller avec diagramme de classe
  var value = new EconomicEvaluation
  var polution = new Polution
  var criminality = new Criminality
  var population: Population = new Population()
  var tab = ofDim[Box](s.length, s.width)
  for (a <- 0 until s.length) {
    for (b <- 0 until s.width) {
      tab(a)(b) = new Box(new Location(a, b),getRandomBaseType())
    }
  }

  def getRandomBaseType():EnumBase = {
    val n = (Math.random()*EnumBase.size).toInt
    n match {
      case 0 => return EnumBase.WATER
      case 1 => return EnumBase.TREE
      case _ => return EnumBase.EARTH
    }
  }
  
  def constructInfrastructure(i: Infrastructure) {
    for (a <- i.topCornerLocation.x until i.topCornerLocation.x + i.size.length) {
      for (b <- i.topCornerLocation.y until i.topCornerLocation.y + i.size.width) {
        tab(a)(b).addInfrastructure(i);
      }
    }
  }
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
  def positionAnInfrastructure(i:Infrastructure)={
    for (a <- i.topCornerLocation.x until i.topCornerLocation.x + i.size.length) {
      for (b <- i.topCornerLocation.y until i.topCornerLocation.y + i.size.width) {
        tab(a)(b).addInfrastructure(i);
      }
    }
  }
  
  def getBoxAt(l: Location):Box ={
    return tab(l.x)(l.y)
  }
  
  
}