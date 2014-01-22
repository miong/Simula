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

abstract class Network(l: Location) extends Infrastructure(l) {
  var flux:Flux = new Flux
  
  price.setValue(10)
  this.population.setMaxCapacity(0)
  this.size=new Size(1,1)
  this.polution.setValue(2)
  this.criminality.setValue(3)
  
  def view: String = {
    return "Network"
  }
}