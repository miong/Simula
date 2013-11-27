/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.model.rules
 * RulesAccess.scala
 * (c)Simula_Dev1.0 on 25 nov. 2013 11:04:44
 * By Bubul
 * Update 25 nov. 2013 11:04:44
 * *******************************************************
 */
package main.scala.simula.model.rules
import main.scala.simula.common.GameRuleInterface
/**
 * @author Bubul
 *
 */
trait RulesAccess {

  def getRules(): Set[GameRuleInterface];

}