/**
 * ********************************************************
 *                        Simula                          *
 * *********************************************************
 * simula.adapters
 * ModelEngineAdapter.scala
 * (c) Simula. on 3 nov. 2013 03:18:59
 * By JC
 * Update 3 nov. 2013 03:18:59
 *
 * *******************************************************
 */
package main.scala.simula.adapters

import main.scala.simula.model._
import main.scala.simula.model.city._
import main.scala.simula.model.player._
import main.scala.simula.engine._
import main.scala.simula.common._
/**
 * @author JC
 *
 */
class ModelEngineAdapter extends ModelEngineAdapterInterface {
  var model: ModelInterface = null
  var engine: EngineInterface = null

  def INIT(mod: ModelInterface, eng: EngineInterface): Unit = {
    model = mod
    engine = eng
  }
  def getData(): RetrievedInformationInterface = model.giveInformations
  def ack(data: RetrievedInformationInterface): Boolean = true;

}