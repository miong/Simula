/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * main.scala.simula.common
 * SideEffectInterface.scala
 * (c) Simula. on 22 nov. 2013 10:19:54
 * By JC
 * Update 22 nov. 2013 10:19:54
 *
 * *******************************************************
 */
package main.scala.simula.common

import main.scala.simula.engine.AbstractModel


/**
 * @author JC
 *
 */
@serializable trait SideEffectInterface extends Persistent{
  
  var duration:Integer = 1; // Duration in number of top
  var priority:Integer = 0; // Priority of this Fx, [0 -> 10? 0 most important]
  var location:Location = new Location(0,0); // Location on the map where it takes place
  var size:Size = new Size(1,1); // Size of the effect
  
  /**
   * Function representing the effects of the effect
   * It take in parameter the actual state of the game
   * and return an evolution of this state represented by a RetrievedInformationInterface
   */
  var fx:Function[AbstractModel,Unit];
  
  //apply the fx Function
  def apply(model:AbstractModel):Unit = {
    fx.apply(model)
  }
}