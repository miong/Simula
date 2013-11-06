/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * simula.ui
 * AbstractEngine.scala
 * (c) Simula. on 6 nov. 2013 00:07:59
 * By JC
 * Update 6 nov. 2013 00:07:59
 *
 * *******************************************************
 */
package simula.ui

import simula.common._
/**
 * @author JC
 *
 */
trait AbstractEngine {
	def updatedEvent(e: EventInterface);
}