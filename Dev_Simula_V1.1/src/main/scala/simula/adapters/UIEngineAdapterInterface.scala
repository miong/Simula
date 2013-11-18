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
 * No need de cette interface
 */
abstract class UIEngineAdapterInterface extends AbstractEngine with AbstractView {

  def INIT(_ui: UIInterface, eng: EngineInterface): Unit

}