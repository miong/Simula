/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.model.rules
 * GameRule.scala
 * (c)Simula_Dev1.0 on 25 nov. 2013 10:58:29
 * By Bubul
 * Update 25 nov. 2013 10:58:29
 * *******************************************************
 */
package main.scala.simula.model.rules
import main.scala.simula.common._
/**
 * @author Bubul
 *
 */

// this is a doing nothing rule
object Nop extends GameRuleInterface{
	
  def apply(ri:RetrievedInformationInterface): Set[SideEffectInterface] = {
    println("Nop invocked");
    var fxs:Set[SideEffectInterface] = Set()
    fxs += main.scala.simula.model.effects.NoFx;
    return fxs
  }
  
  def isApplyable(ri:RetrievedInformationInterface): Boolean = {
    return true;
  }
  
}