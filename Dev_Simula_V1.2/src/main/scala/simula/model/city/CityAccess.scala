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
import main.scala.simula.common.StructureType._

trait CityAccess {
  def getCellAt(l: Location): Cell
  def constructInfrastructureAt(structType: StructureType, l: Location)
  def mapSize(): Size;
  def getMapAsViewabel(): Viewable;
  def destroyAt(l:Location):Boolean
}