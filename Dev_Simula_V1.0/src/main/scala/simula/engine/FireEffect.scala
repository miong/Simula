/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * main.scala.simula.engine
 * FireEffect.scala
 * (c) Simula. on 14 nov. 2013 23:07:59
 * By JC
 * Update 14 nov. 2013 23:07:59
 *
 * *******************************************************
 */
package main.scala.simula.engine

import main.scala.simula.common._

/**
 * @author JC
 *
 */
class FireEffect(location: Location, size: Size, ri: RetrievedInformationInterface)
  extends SideEffect(location, size, ri) {

  def apply() = ri
  def bindWith(se: SideEffect): RetrievedInformationInterface = ri
}