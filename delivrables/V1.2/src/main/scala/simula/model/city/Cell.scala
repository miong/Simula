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
import main.scala.simula.common._

class Cell(l: Location, pbaseType: GroundType) extends Viewable {
  var location: Location = l
  var value: EconomicEvaluation = new EconomicEvaluation
  var population: Population = new Population;
  var polution: Polution = new Polution;
  var criminality: Criminality = new Criminality;
  var infrastructures: Set[Infrastructure] = Set();
  var baseType: GroundType = pbaseType;

  def addInfrastructure(i: Infrastructure) {
    infrastructures += i;
  }
  def view: String = {
    baseType match {
      case EARTH => return "EARTH"
      case WATER => return "WATER"
      case TREE => return "TREE"
      case STONE => return "STONE"
      case GRASS => return "GRASS"
      case _ => return "??"
    }
  }

  def getType = baseType
  def getSize(): Size = {
    return new Size(1, 1)
  }
  def getLocation(): Location = {
    return location
  }
  def priority(): Integer = {
    return 1
  }
}