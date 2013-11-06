/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * ui.textview
 * TextView.scala
 * (c) Simula. on 6 nov. 2013 00:03:01
 * By JC
 * Update 6 nov. 2013 00:03:01
 *
 * *******************************************************
 */
package simula.ui.textview

import simula.ui._
import simula.common._
import simula.ui.InterfaceType._
/**
 * @author JC
 *
 */
class TextView(ri: RetreivedInformationInterface,
				ae: AbstractEngine, 
				size: Size, loc: Location) extends UIInterface {
	maxSize = size
	actualLocation = loc
	engine = ae
	def redefineView = println("CLIVIEW RedefineView Called")
	def updateView (d: RetreivedInformationInterface) = println("CLIVIEW UpdateView Called")
}