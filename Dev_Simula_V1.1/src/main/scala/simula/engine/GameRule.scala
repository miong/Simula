/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * main.scala.simula.engine
 * GameRule.scala
 * (c) Simula. on 13 nov. 2013 11:40:20
 * By JC
 * Update 13 nov. 2013 11:40:20
 *
 * *******************************************************
 */
package main.scala.simula.engine

import main.scala.simula.common._
/**
 * @author JC
 * A rule is an base set of statement which come into
 * an side effect, town update or game ended.
 */
abstract class GameRule {

  /**
   * Applying a game rule is the same as asking for new information state updated
   * params
   * return Option[RetrievedInformationInterface]
   */
  def apply(): Option[RetrievedInformationInterface]
  //	
  //var t = new Rules {
  //  def apply() = ()
  //  def isApplicable() = true
  //}
}

