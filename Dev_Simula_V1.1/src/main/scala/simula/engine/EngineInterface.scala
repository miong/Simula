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

import main.scala.simula.common._

trait EngineInterface extends MonthListener{

  def newEvent(e: EventInterface): RetrievedInformationInterface
  def permiteOperations(): List[Pair[String, Unit => Unit]]
  def getDataFromModel(): RetrievedInformationInterface
  def sendDataToView(data: RetrievedInformationInterface): Boolean
  def getFromModelToView(): Boolean
  def treatDataFromModel(data: RetrievedInformationInterface): Unit
  def sendDataToModel(data: RetrievedInformationInterface): Boolean
  def loadRules:Unit
  
}