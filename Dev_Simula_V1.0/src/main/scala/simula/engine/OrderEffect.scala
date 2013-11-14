/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * main.scala.simula.engine
 * OrderEffect.scala
 * (c) Simula. on 15 nov. 2013 00:07:52
 * By JC
 * Update 15 nov. 2013 00:07:52
 *
 * *******************************************************
 */
package main.scala.simula.engine

import main.scala.simula.common._

/**
 * @author JC
 *
 */
class OrderEffect(location: Location, size: Size, ri: RetrievedInformationInterface)
  extends SideEffect(location, size, ri) {

  def apply(): RetrievedInformationInterface = ri
  def bindWith(se: SideEffect): RetrievedInformationInterface = ri

}