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

trait AbstractModel {
  def getData(): RetrievedInformationInterface
  def ack(data: RetrievedInformationInterface): Boolean
  def getRules(): Set[GameRuleInterface]
  def getMapSize(): Size
}