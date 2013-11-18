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
import main.scala.simula.model.city.EnumBase._

class Box(l: Location, boxBaseType : EnumBase) extends Viewable {
  var location: Location = l
  //Ajout pour coller avec diagramme de classe
  var value: EconomicEvaluation = new EconomicEvaluation
  var population:Population = new Population;
  var polution:Polution = new Polution;
  var criminality:Criminality = new Criminality;
  var infrastructures: Set[Infrastructure] = Set();
  //ajout pour coller au diagramme de classe
  var baseType : EnumBase = boxBaseType;

  def addInfrastructure(i: Infrastructure) {
    infrastructures += i;
  }
  def view: String = {
    return "box +x:" + location.x + " y:" + location.y
  }

  def getSize(): Size = {
    return new Size(1, 1)
  }
  def getLocation(): Location = {
    return location
  }
  def priority(): Integer = {
    return 2
  }
}