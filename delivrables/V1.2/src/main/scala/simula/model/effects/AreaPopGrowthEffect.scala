/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.model.effects
 * AreaPopGrowthEffect.scala
 * (c)Simula_Dev1.0 on 28 nov. 2013 15:26:19
 * By Bubul
 * Update 28 nov. 2013 15:26:19
 * *******************************************************
 */
package main.scala.simula.model.effects

import main.scala.simula.common.SideEffectInterface
import main.scala.simula.engine.AbstractModel

/**
 * @author Bubul
 *
 */
 object AreaPopGrowthEffect extends SideEffectInterface{

  var fx:Function[AbstractModel,Unit] = (mod: AbstractModel) => {
    //println("Area Pop Growth Invoked")
    var data = mod.getScreenShot
    for(inf <- data.getInfrastructures)
      if(inf.view.startsWith("Area") && inf.population.getMaxCapacity > inf.population.getValue){
    	//println(inf.population.getValue)
        inf.population.setValue(inf.population.getValue()+5)
        //println(inf.population.getValue)
      }
  }
  
}