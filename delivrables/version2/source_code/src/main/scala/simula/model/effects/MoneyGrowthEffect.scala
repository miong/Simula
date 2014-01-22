/**
 * *******************************************************
 * simula-project
 * main.scala.simula.model.effects
 * MoneyGrowthEffect.scala
 * (c)simula-project on 3 déc. 2013 14:30:20
 * By Scarpe
 * Update 3 déc. 2013 14:30:20
 * *******************************************************
 */
package main.scala.simula.model.effects

import main.scala.simula.common.SideEffectInterface
import main.scala.simula.engine.AbstractModel

/**
 * @author Scarpe
 *
 */
object MoneyGrowthEffect extends SideEffectInterface{

  var fx:Function[AbstractModel,Unit] = (mod: AbstractModel) => {
    var data = mod.getData
    		if(data.getNumberOfCitizen> 25){
        mod.addToPlayerMoney(data.getNumberOfCitizen.toInt*2)
      }
  }
  
}