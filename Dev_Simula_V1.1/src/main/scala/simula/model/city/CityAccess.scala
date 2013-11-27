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
  /*
  	def getNumberOfCitizens():Int;
  	*/
  def constructAnArea(l: Location);
  // def getMapAccess(): Map;
  //----------ajout pour coller au diag de classe
  def getCellAt(l: Location): Cell
  def constructInfrastructureAt(InfrastructureType: StructureType, l: Location)
  def mapSize(): Size;
  def getMapAsViewabel(): Viewable;
}