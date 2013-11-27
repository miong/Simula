/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * main.scala.simula.engine
 * GameRuleInterface.scala
 * (c) Simula. on 13 nov. 2013 11:40:20
 * By JC
 * Update 13 nov. 2013 11:40:20
 *
 * *******************************************************
 */
package main.scala.simula.common


/**
 * @author JC
 * A rule is an base set of statement which come into
 * an side effect, town update or game ended.
 */
abstract class GameRuleInterface{

  /**
   * Applying a game rule is the same as asking for new information state updated
   * params
   * return Set[SideEffectInterface]
   */
  def apply(ri:RetrievedInformationInterface): Set[SideEffectInterface]
  
  
  /**
   * Tell if the rule is applyable according to the state of the game
   */
  def isApplyable(ri:RetrievedInformationInterface): Boolean;

  
  // MODO: Just Why ?? There's no need to combine 2 rules... and more over why just 2 ?!
  /**
   * Combine the actual rule with an other rule
   * params a GameRuleInterface
   * return RetrievedInformationInterface which represente the new state of town
   * with the appropriate side effect applicated. Example FiremanEffect and FireEffect can be bound
   */
  //def bindWith(se: GameRuleInterface[T]): RetrievedInformationInterface

}

