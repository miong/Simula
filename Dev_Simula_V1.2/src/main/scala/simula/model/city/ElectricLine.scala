/**
 * *******************************************************
 * Simula
 * main.scala.simula.model.city
 * ElectricLine.scala
 * (c)Simula on 21 janv. 2014 22:19:02
 * By ken
 * Update 21 janv. 2014 22:19:02
 * *******************************************************
 */
package main.scala.simula.model.city

import main.scala.simula.common.Location

/**
 * @author ken
 *
 */
class ElectricLine(l:Location) extends ElectricGrid(l) {

  
  override def view: String = {
    return "ElectricLine x:" + l.x + " y:" + l.y
  }
  
}