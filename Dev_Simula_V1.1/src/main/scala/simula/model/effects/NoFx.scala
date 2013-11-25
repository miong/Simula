/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.engine.effects
 * NoFx.scala
 * (c)Simula_Dev1.0 on 25 nov. 2013 11:30:18
 * By Bubul
 * Update 25 nov. 2013 11:30:18
 * *******************************************************
 */
package main.scala.simula.model.effects

import main.scala.simula.common._

/**
 * @author Bubul
 *
 */

// This is a doing nothing effect
object NoFx extends SideEffectInterface{
  
	var fx:Function[RetrievedInformationInterface,RetrievedInformationInterface] = (ri:RetrievedInformationInterface) => new RetrievedInformation(0,0,0,Set(),new Location(0,0),new Size(0,0))
}