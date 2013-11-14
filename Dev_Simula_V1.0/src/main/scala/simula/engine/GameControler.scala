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

/**
 * Game controler takes information from UI
 * to apply some rules after a brief analyse of the game state
 * It contains a set of SideEffect and necessary information of the present turn
 *
 */
class GameControler {
  var sideEffect: Set[SideEffect] = _
  var ruleSet: Set[GameRule] = _
  var volatRi: RetrievedInformationInterface = _ // non-persistent

  /**
   * Complete operation to return a new state based on actual state which come from the UI.
   * That could be used by the Model or any following operations which need to.
   * params data: RetrievedInformationInterface
   * return RetrievedInformationInterface
   */
  def treatDataFromUI(data: RetrievedInformationInterface): RetrievedInformationInterface = {
    data
  }

  /**
   * Complete operation to return a new state based on actual state which come from the model.
   * That could be used by the UI or any following operations
   * params data: RetrievedInformationInterface
   * return RetrievedInformationInterface
   */

  def treatDataFromModel(data: RetrievedInformationInterface): RetrievedInformationInterface = {
    data
  }
}