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

class Area(l: Location) extends Building(l) {
  size = new Size(3, 3);
  def view: String = {
    return "Area x:" + l.x + " y:" + l.y
  }
}