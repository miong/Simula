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


/**
 * @author JC
 *
 */
@serializable trait SideEffectInterface[T] extends Persistent{

  protected var query:T   // we can choice to turn up ours small query language through xml or string representation
  protected var isActive: Boolean = false //A non-active side effect should be pull off the effective side effect set 
  def setOrder(order: T) ;
  def getOrder() : T
  /* operation to construct a query for an effect */
  def combineOrder(order: SideEffectInterface[T]);
  def increasePopulationByAt(n: Int, loc: Location); // by -n to decrease
  def increaseCriminalityByAt(n: Int, loc: Location);
  def increasePollutionByAt(n: Int, loc: Location);
  def increaseFundBy(n : Int);
  
}