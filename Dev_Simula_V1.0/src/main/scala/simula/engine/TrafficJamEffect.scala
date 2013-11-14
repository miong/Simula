/**
 * *******************************************************
 * Simula
 * Engine
 * TrafficJamEffect.scala
 * (c) Simula. on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * *******************************************************
 */

package main.scala.simula.engine

import main.scala.simula.common._
class TrafficJamEffect(location: Location, size: Size, ri: RetrievedInformationInterface)
  extends SideEffect(location, size, ri) {

  def apply() = ri
  def bindWith(se: SideEffect): RetrievedInformationInterface = ri

}