/**
 * *******************************************************
 * SimulaGame
 * Engine
 * ll.scala
 * (c)SimulaGame on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * 
 * Classe representant le model avec lequel l'Engine communique
 * Y est decrit le protocole de communication necessaire pour l'Engine
 *********************************************************/
package simula.engine

import simula.common._

abstract class AbstractModel {
  // Je pense a quelque chose comme
  // def stateData(): RetreivedInformationInterface
  // def controlledData(nd: RetreivedInformationInterface) 
  // et d'autres p-e plus tard
  def modifierModel(e: EngineInterface) // flou tout ça
  def recupererInfo(e: EngineInterface)
}