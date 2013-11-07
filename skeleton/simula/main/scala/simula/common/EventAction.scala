/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * simula.common
 * EventAction.scala
 * (c) Simula. on 6 nov. 2013 01:36:39
 * By JC
 * Update 6 nov. 2013 01:36:39
 *
 * *******************************************************
 */
package main.scala.simula.common

/**
 * @author JC
 *
 */
class EventAction(l: Location, descr: String) {
  def location: Location = l
  def size: Size = new Size(0, 0)
  def description: String = descr
}