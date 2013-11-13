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

import Array._;
import main.scala.simula.common._

class Map(s: Size) extends Viewable {
  var size: Size = s
  var value: Int = 0
  var polution: Int = 0
  var criminality: Int = 0
  var population: Population = new Population()
  var tab = ofDim[Box](s.length, s.width)
  for (a <- 0 until s.length) {
    for (b <- 0 until s.width) {
      tab(a)(b) = new Box(new Location(a, b))
    }
  }

  def constructInfrastructure(i: Infrastructure) {
    for (a <- i.location.x until i.location.x + i.size.length) {
      for (b <- i.location.y until i.location.y + i.size.width) {
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
  
  
 def getSize(): Size={
    return size
  }
  def getLocation(): Location={
    return new Location(0,0)
  }
  def priority(): Integer={
    return 0
  }
}