/**
 * *******************************************************
 * simula-project
 * main.scala.simula.model.rules
 * MoneyGrowth.scala
 * (c)simula-project on 3 déc. 2013 14:27:45
 * By Scarpe
 * Update 3 déc. 2013 14:27:45
 * *******************************************************
 */
package main.scala.simula.model.rules

import main.scala.simula.common._
import main.scala.simula.model.effects.MoneyGrowthEffect

/**
 * @author Scarpe
 *
 */
object MoneyGrowth extends GameRuleInterface{
  
  def apply(data:MapScreenShotInterface): Set[SideEffectInterface] = {
    var fxs:Set[SideEffectInterface] = Set()
    fxs = fxs +  MoneyGrowthEffect
    return fxs
  }
  
  def isApplyable(data:MapScreenShotInterface): Boolean = {
    return true;
  }

}