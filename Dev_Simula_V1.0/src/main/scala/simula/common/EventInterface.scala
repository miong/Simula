/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * simula.common
 * EventInterface.scala
 * (c) Simula. on 6 nov. 2013 01:36:08
 * By JC
 * Update 6 nov. 2013 01:36:08
 *
 * *******************************************************
 */
package main.scala.simula.common

/**
 * @author JC
 *
 */
abstract case class EventInterface{
  def location: 	Location
  def size:			Size 
  def description:	String
  
}