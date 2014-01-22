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

abstract class Infrastructure(var l: Location) extends Viewable {
  var size: Size = new Size(0, 0);
  var topCornerLocation: Location = l
  var price: Price = new Price;
  var polution = new Polution;
  var criminality = new Criminality;
  var population: Population = new Population();
  def view: String

  def getSize(): Size = {
    return size
  }
  def getLocation(): Location = {
    return topCornerLocation
  }
  def priority(): Integer = {
    return 2
  }

}
