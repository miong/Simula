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
package Engine

abstract class EngineBuilderInterface {
	def build(v:AbstractView,m:AbstractModel):AbstractEngine
}