/**
 * *******************************************************
 * Simula
 * main.scala.simula.model.city
 * Road.scala
 * (c)Simula on 21 janv. 2014 22:18:42
 * By ken
 * Update 21 janv. 2014 22:18:42
 * *******************************************************
 */
package main.scala.simula.model.city

import main.scala.simula.common.Location
import main.scala.simula.common.Size

/**
 * @author ken
 *
 */
class Road (l:Location) extends TransportWays(l){

  
  
  override def view: String = {
    return "Road x:" + l.x + " y:" + l.y
  }
  
}