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
class GameControler() {
  var sideEffects: Set[SideEffectInterface] = _
  var rules: Set[GameRuleInterface] = _
  var volatRi: RetrievedInformationInterface = _ // non-persistent
  var mod:AbstractModel= _
  /**
   * Complete operation to return a new state based on actual state which come from the UI.
   * That could be used by the Model or any following operations which need to.
   * params data: RetrievedInformationInterface
   * return RetrievedInformationInterface
   */
  
  def setModel(model:AbstractModel) = {
    mod = model
  }
  
  def treatDataFromUI(data: RetrievedInformationInterface): RetrievedInformationInterface = {
    data
  }

  /**
   * Complete operation to return a new state based on actual state which come from the model.
   * That could be used by the UI or any following operations
   * params data: RetrievedInformationInterface
   * return RetrievedInformationInterface
   */

  def treatDataFromModel(data: RetrievedInformationInterface): Unit = {
    // Treatment of all Rules and generation of all the needed effects
    var fxs:Set[SideEffectInterface] = Set()
    for(r:GameRuleInterface <- rules){
      if(r.isApplyable(data)){
    	  fxs =  fxs.union(r.apply(data))
      }
    }
    // Need FX applier to apply all the fx of fxs that return a new RetrievedInformationInterface
    // Fx applier need to modify the model to apply the fx on it to
  }
  
  
  def loadRulesFromModel():Unit = {
    rules = mod.getRules();
  }

  
}