/**
 * *******************************************************
 * simula-project
 * main.scala.simula.model.city
 * WonderLand.scala
 * (c)simula-project on 2 déc. 2013 12:13:36
 * By Scarpe
 * Update 2 déc. 2013 12:13:36
 * *******************************************************
 */
package main.scala.simula.model.city

import main.scala.simula.common._

/**
 * @author Scarpe
 *
 */
class WonderLand(l:Location) extends Infrastructure(l:Location){

  size = new Size(1, 1);
  this.population.setMaxCapacity(0);
  
  override def priority(): Integer = {
    return 42
  }
  
  def view: String = {
    return "WONDERLAND x:" + l.x + " y:" + l.y
  }
  
}