/**
 * *******************************************************
 * Simula
 * simula.model.time
 * ClockInterface.scala
 * (c)Simula on 6 nov. 2013 09:59:59
 * By Bubul
 * Update 6 nov. 2013 09:59:59
 * *******************************************************
 */
package main.scala.simula.model.time

/**
 * @author Bubul
 *
 */
trait ClockInterface {
	
  def register(tf:TimeFilter):Unit
  def sendTop():Unit
  
}