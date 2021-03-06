/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * simula.common
 * Viewable.scala
 * (c) Simula. on 6 nov. 2013 09:54:46
 * By JC
 * Update 6 nov. 2013 09:54:46
 *
 * *******************************************************
 */
package main.scala.simula.common

/**
 * @author JC
 *
 */
@serializable trait Viewable extends Persistent{
  def view: String
  def getLocation: Location
  def getSize: Size
  def priority: Integer
}