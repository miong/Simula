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
import main.scala.simula.model.city.EnumType._

class City(s: Size) extends CityAccess {
  var map: Map = new Map(s)
  val infraBuilder = new InfrastructureBuilder()
  /*def getMapAccess(): Map = {
    return map;
  }*/
  
  def mapSize = map.getSize();
  
  def getBoxAt(l:Location):Box = map.getBoxAt(l);
  
  def constructInfrastructureAt(InfrastructureType: EnumType,l:Location) = {
    val i:Infrastructure = infraBuilder.build(InfrastructureType, l)
    map.constructInfrastructure(i)
  }

  def constructAnArea(l: Location) {
    map.constructInfrastructure(new Area(l));
  }
  /*
	def getNumberOfCitizens():Int={
	  return map.getNumberOfCitizens;
	}*/

}
