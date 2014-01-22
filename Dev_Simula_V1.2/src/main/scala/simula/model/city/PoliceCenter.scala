/**
 * *******************************************************
 * Simula
 * main.scala.simula.model.city
 * PoliceCenter.scala
 * (c)Simula on 21 janv. 2014 22:15:40
 * By ken
 * Update 21 janv. 2014 22:15:40
 * *******************************************************
 */
package main.scala.simula.model.city

import main.scala.simula.common.Location
import main.scala.simula.common.Size
/**
 * @author ken
 *
 */
class PoliceCenter(l:Location) extends Station(l){

  price.setValue(100)
  this.population.setMaxCapacity(0)
  this.size=new Size(4,4)
  this.polution.setValue(5)
  this.criminality.setValue(0)
  
  override def view: String = {
    return "PoliceCenter x:" + l.x + " y:" + l.y
  }
  
}