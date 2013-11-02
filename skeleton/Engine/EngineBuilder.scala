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

class EngineBuilder extends EngineBuilderInterface {
	def build(v:AbstractView,m:AbstractModel):AbstractEngine={
		var engine:ConcreteEngine = new ConcreteEngine()
		engine.model=m
		engine.view = v
		return engine
	}
}