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

import main.scala.simula.common._

class City(s: Size) extends CityAccess {
  var map: Map = new Map(s)

  def getMapAccess(): Map = {
    return map;
  }

  def constructAnArea(l: Location) {
    map.constructInfrastructure(new Area(l));
  }
  /*
	def getNumberOfCitizens():Int={
	  return map.getNumberOfCitizens;
	}*/
  
}
