/*********************************************************
 *               		Simula                           *
 *********************************************************
 * simula.ui
 * ViewBuilder.scala
 * (c) Simula. on 6 nov. 2013 01:02:53
 * By JC
 * Update 6 nov. 2013 01:02:53
 *
 *********************************************************/
package simula.ui

import simula.ui.textview.TextView
import simula.ui.InterfaceType._
import simula.common._
/**
 * @author JC
 *
 */
class ViewBuilder {
	def buildView(it: InterfaceType, 
				ae: AbstractEngine, 
				ri: RetreivedInformationInterface): UIInterface = {
	  val view = new TextView(ri, ae, new Size(10, 10), new Location(0, 0))
	  view
	}

}