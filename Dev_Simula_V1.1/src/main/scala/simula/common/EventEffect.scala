/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * simula.common
 * EventEffect.scala
 * (c) Simula. on 6 nov. 2013 01:38:05
 * By JC
 * Update 6 nov. 2013 01:38:05
 *
 * *******************************************************
 */
package main.scala.simula.common

/**
 * @author JC
 *
 */
class EventEffect(descr: String = "") extends EventInterface {
  def location: Location = new Location(0, 0)
  def size: Size = new Size(0, 0)
  def description: String = descr
}