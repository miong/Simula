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
import main.scala.simula.common.GroundType._
import main.scala.simula.common.StructureType._

class City(s: Size) extends CityAccess {
  var map: Map = new Map(s)
  val infraBuilder = new InfrastructureBuilder()

  def mapSize = map.getSize();

  def getMapAsViewabel(): Viewable = {
    return map;
  }
  

  def getCellAt(l: Location): Cell = map.getCellAt(l);

  def constructInfrastructureAt(structType: StructureType, l: Location) = {
    val i: Infrastructure = infraBuilder.build(structType, l)
    map.positionAnInfrastructure(i)
  }
  
  def destroyAt(l:Location) = map.destroyAt(l:Location)

}
