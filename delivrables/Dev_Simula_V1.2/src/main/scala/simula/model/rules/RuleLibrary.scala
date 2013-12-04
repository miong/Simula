/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.model.rules
 * RuleLibrary.scala
 * (c)Simula_Dev1.0 on 25 nov. 2013 10:57:42
 * By Bubul
 * Update 25 nov. 2013 10:57:42
 * *******************************************************
 */
package main.scala.simula.model.rules
import main.scala.simula.common.GameRuleInterface

/**
 * @author Bubul
 *
 */
object RuleLibrary extends RulesAccess{

  var rules:Set[GameRuleInterface] = Set()
  
  rules += Nop
  rules += AreaPopGrowth
  rules += MoneyGrowth
  
  def getRules():Set[GameRuleInterface] = {
    return rules
  }
  
}