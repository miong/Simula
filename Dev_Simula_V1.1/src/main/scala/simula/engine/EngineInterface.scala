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

  def newAction(e: ActionInterface): Unit
  def permiteOperations(): List[Pair[String, Unit => Unit]]
  def getInformationsFromModel(): RetrievedInformationInterface
  def getDataFromModel(): MapScreenShotInterface
  def sendDataToView(data: RetrievedInformationInterface): Boolean
  def getFromModelToView(): Boolean
  def treatDataFromModel(data:MapScreenShotInterface): Unit
  def sendDataToModel(data: RetrievedInformationInterface): Boolean
  def loadRules:Unit
  
}