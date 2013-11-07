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
package main.scala.simula.engine

class EngineBuilder extends EngineBuilderInterface {

  def build(model: AbstractModel, view: AbstractView): EngineInterface = {
    var engine: ConcreteEngine = new ConcreteEngine(model, view)

    return engine
  }
}