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

class Box(l: Location) extends Viewable {
  var location: Location = l
  var value: Int = 0;
  var polution: Int = 0;
  var criminality: Int = 0;
  var infrastructures: Set[Infrastructure] = Set();

  def addInfrastructure(i: Infrastructure) {
    infrastructures += i;
  }
  def view: String = {
    return "box +x:" + location.x + " y:" + location.y
  }
  
  
 def getSize(): Size={
    return new Size(1,1)
  }
  def getLocation(): Location={
    return location
  }
  def priority(): Int={
    return 2
  }
}