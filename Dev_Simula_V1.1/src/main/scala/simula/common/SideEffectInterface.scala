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
@serializable trait SideEffectInterface extends Persistent {

 
// It's all you want but not that we decided all together !!!!
//  protected var query:T   // we can choice to turn up ours small query language through xml or string representation
//  protected var isActive: Boolean = false //A non-active side effect should be pull off the effective side effect set 
//  def setOrder(order: T) ;
//  def getOrder() : T
//  /* operation to construct a query for an effect */
//  def combineOrder(order: SideEffectInterface[T]);
//  def increasePopulationByAt(n: Int, loc: Location); // by -n to decrease
//  def increaseCriminalityByAt(n: Int, loc: Location);
//  def increasePollutionByAt(n: Int, loc: Location);
//  def increaseFundBy(n : Int);
  
  var duration:Integer = 1; // Duration in number of top
  var priority:Integer = 0; // Priority of this Fx, [0 -> 10? 0 most important]
  var location:Location = new Location(0,0); // Location on the map where it takes place
  var size:Size = new Size(1,1); // Size of the effect
  
  /**
   * Function representing the effects of the effect
   * It take in parameter the actual state of the game
   * and return an evolution of this state represented by a RetrievedInformationInterface
   */

  var fx: Function[RetrievedInformationInterface, RetrievedInformationInterface];

  //apply the fx Function
  def apply(state: RetrievedInformationInterface): RetrievedInformationInterface = {
    return fx.apply(state)
  }
}
