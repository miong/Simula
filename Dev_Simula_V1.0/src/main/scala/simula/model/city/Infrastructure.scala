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

abstract class Infrastructure(l: Location) extends Viewable {
  // Default value added !! need a Builder To set them at initialisation !!
  var size: Size = new Size(0, 0);
  var topCornerlocation: Location = l
  //Ajout pour coller avec diagramme de classe
  var price:Mesure;
  var polution: Int = 0;
  var criminality: Int = 0;
  var population: Population = new Population();
  def view: String

  def getSize(): Size = {
    return size
  }
  def getLocation(): Location = {
    return location
  }
  def priority(): Integer = {
    return 2
  }
}