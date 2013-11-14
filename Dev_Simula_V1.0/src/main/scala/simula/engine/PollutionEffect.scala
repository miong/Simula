/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * main.scala.simula.engine
 * PollutionEffect.scala
 * (c) Simula. on 14 nov. 2013 23:12:46
 * By JC
 * Update 14 nov. 2013 23:12:46
 *
 * *******************************************************
 */
package main.scala.simula.engine

import main.scala.simula.common._

/**
 * @author JC
 *
 */
class PollutionEffect(location: Location, size: Size, ri: RetrievedInformationInterface)
  extends SideEffect(location, size, ri) {

  def apply(): RetrievedInformationInterface = ri
  def bindWith(se: SideEffect): RetrievedInformationInterface = ri
}