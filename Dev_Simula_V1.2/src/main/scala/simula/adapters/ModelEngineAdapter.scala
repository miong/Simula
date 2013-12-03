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
import main.scala.simula.common.StructureType._

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
  def getData(loc:Location,siz:Size): RetrievedInformationInterface = model.giveInformations(loc,siz)
  def ack(data: RetrievedInformationInterface): Boolean = true;
  def getRules():Set[GameRuleInterface] = model.giveRulesAccess.getRules
  def getMapSize:Size = model.giveCityAccess.mapSize
  def getScreenShot : MapScreenShotInterface = model.getScreenShot
  def getActiveEffect : Set[SideEffectInterface] = return model.getActiveEffect
  def setActiveEffect(fxs: Set[SideEffectInterface]) : Unit = model.setActiveEffect(fxs)
  def getSizeOf(st:StructureType):Size = model.getSizeOf(st)
  def constructInfrastructureAt(InfrastructureType: StructureType, location : Location) = model.constructInfrastructureAt(InfrastructureType, location)
  def destroyAt(l:Location):Unit = model.destroyAt(l)
}