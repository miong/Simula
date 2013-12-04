/**
 * ********************************************************
 *                        Simula                          *
 * *********************************************************
 * simula.adapters
 * UIEngineAdapter.scala
 * (c) Simula. on 3 nov. 2013 02:57:52
 * By JC
 * Update 3 nov. 2013 02:57:52
 *
 * ******************************************************
 */
package main.scala.simula.adapters

import main.scala.simula.ui._
import main.scala.simula.common._
import main.scala.simula.engine._
/**
 * @author JC
 * ConcreteEngine should be EngineInterface
 */
class UIEngineAdapter extends UIEngineAdapterInterface {

  var ui: UIInterface = null
  var engine: EngineInterface = null

  def INIT(_ui: UIInterface, eng: EngineInterface) {
    ui = _ui
    engine = eng
  }

  def ack(d: RetrievedInformationInterface): Boolean = {
    ui.updateView(d);
    return true;
  }
  def newAction(e: ActionInterface) = engine.newAction(e)
  
  def printSyntaxe():Unit = ui.printSyntaxe
  def printError(err:String):Unit = ui.printError(err)
}