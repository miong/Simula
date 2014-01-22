/**
 * *******************************************************
 * Simula
 * main.scala.simula.model.city
 * Residence.scala
 * (c)Simula on 21 janv. 2014 22:16:57
 * By ken
 * Update 21 janv. 2014 22:16:57
 * *******************************************************
 */
package main.scala.simula.model.city

import main.scala.simula.common.Location
import main.scala.simula.common.Size

/**
 * @author ken
 *
 */
class Residence(l:Location) extends Area(l){
  price.setValue(75)
  this.population.setMaxCapacity(90)
  this.polution.setValue(15)
  this.criminality.setValue(30)
  override def view: String = {
    return "Residence x:" + l.x + " y:" + l.y
  }
  

}