/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * main.scala.simula.engine
 * firemanEffect.scala
 * (c) Simula. on 15 nov. 2013 00:02:22
 * By JC
 * Update 15 nov. 2013 00:02:22
 *
 * *******************************************************
 */
package main.scala.simula.engine

import main.scala.simula.common._

/**
 * @author JC
 *
 */
class FiremanEffect(location: Location, size: Size, ri: RetrievedInformationInterface) 
  extends SideEffect(location, size, ri) {

  def apply(): RetrievedInformationInterface = ri
  def bindWith(se: SideEffect): RetrievedInformationInterface = ri
}