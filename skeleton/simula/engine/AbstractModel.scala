/**
 * *******************************************************
 * SimulaGame
 * Engine
 * ll.scala
 * (c)SimulaGame on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * *******************************************************
 */
package simula.engine
import simula.common._

abstract class AbstractModel {
	def getData():RetrievedInformationInterface
	def ack(data:RetrievedInformationInterface):Boolean
}