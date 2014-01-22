/**
 * *******************************************************
 * Simula
 * main.scala.simula.model.city
 * PowerPlant.scala
 * (c)Simula on 21 janv. 2014 22:18:04
 * By ken
 * Update 21 janv. 2014 22:18:04
 * *******************************************************
 */
package main.scala.simula.model.city

import main.scala.simula.common.Location
import main.scala.simula.common.Size

/**
 * @author ken
 *
 */
class PowerPlant(l:Location) extends Plant(l) {

  price.setValue(300)
  this.population.setMaxCapacity(0)
  this.size=new Size(5,5)
  this.polution.setValue(150)
  this.criminality.setValue(10)
  
  override def view: String = {
    return "PowerPlant x:" + l.x + " y:" + l.y
  }
  
}