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


class EngineBuilder extends EngineBuilderInterface {
	def build(v: AbstractView, m: AbstractModel): EngineInterface = {
		//var engine:ConcreteEngine = 
		return new ConcreteEngine(v, m) // pour le moment...
	}
}