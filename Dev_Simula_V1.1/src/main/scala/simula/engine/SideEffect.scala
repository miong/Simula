/**
 * *******************************************************
 * SimulaGame
 * Engine
 * ll.scala
 * (c)SimulaGame on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * *******************************************************
 */
package main.scala.simula.engine

import main.scala.simula.common._
/**
 * SideEffect
 * This class represente objects which can create side effect over the town
 * The result is limited on the location (g point) of the getted's size
 *
 */
// TODO add parameter representing the duration of the effect ?
// What imply to find a way to specify duration in tic, day, mounth...
abstract class SideEffect(var location: Location, var size: Size, var ri: RetrievedInformationInterface) {

  protected var isActive: Boolean = false //A non-active side effect should be pull off the effective side effect set 

  /**
   * Apply effect to the actual informations
   * params
   * return RetrievedInformationInterface which represente the new state of town
   * with the appropriate side effect applicated
   */
  def apply(): RetrievedInformationInterface

  /**
   * Apply effect coupled with an other side effect
   * params
   * return RetrievedInformationInterface which represente the new state of town
   * with the appropriate side effect applicated. Example FiremanEffect and FireEffect can be binded
   */
  def bindWith(se: SideEffect): RetrievedInformationInterface
}