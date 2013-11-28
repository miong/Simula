/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.model.rules
 * AreaPopGrowth.scala
 * (c)Simula_Dev1.0 on 28 nov. 2013 15:25:55
 * By Bubul
 * Update 28 nov. 2013 15:25:55
 * *******************************************************
 */
package main.scala.simula.model.rules

import main.scala.simula.common._
import main.scala.simula.model.effects.AreaPopGrowthEffect
import main.scala.simula.model.city.Infrastructure

/**
 * @author Bubul
 *
 */
object AreaPopGrowth extends GameRuleInterface{
  
  def apply(data:MapScreenShotInterface): Set[SideEffectInterface] = {
    var fxs:Set[SideEffectInterface] = Set()
    fxs = fxs +  AreaPopGrowthEffect
    return fxs
  }
  
  def isApplyable(data:MapScreenShotInterface): Boolean = {
    return data.getInfrastructures.exists(
    		(inf:Infrastructure) => {
    			return inf.view.startsWith("Area")
    		})
  }

}