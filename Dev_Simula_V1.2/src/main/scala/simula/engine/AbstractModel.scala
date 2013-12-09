/**
 * ******************************************************
 * SimulaGame
 * Engine
 * AbstractModel.scala
 * (c)SimulaGame on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * ******************************************************
 */

package main.scala.simula.engine

import main.scala.simula.common._
import main.scala.simula.common.StructureType._

trait AbstractModel {
  def getData(): RetrievedInformationInterface
  def getData(loc:Location,siz:Size): RetrievedInformationInterface
  def ack(data: RetrievedInformationInterface): Boolean
  def getRules():Set[GameRuleInterface]
  def getMapSize():Size
  def getScreenShot():MapScreenShotInterface
  def getActiveEffect(): Set[SideEffectInterface]
  def setActiveEffect(newFxSet: Set[SideEffectInterface]): Unit
  def getSizeOf(st:StructureType):Size
  def constructInfrastructureAt(InfrastructureType: StructureType, location : Location)
  def destroyAt(l:Location):Boolean
  def pay(sum:Integer):Boolean
  def pay(st:StructureType):Boolean
  def getPlayerMoneyAmout:Integer
  def addToPlayerMoney(sum:Integer)
}