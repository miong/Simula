/**********************************************************
 *                        Simula                          *
 **********************************************************
 * simula.ui.guiview
 * GUIView.scala
 * (c) Simula. on 31 oct. 2013 13:30:15
 * By JC
 * Update 31 oct. 2013 13:30:15
 *
 *********************************************************/
package simula.ui.guiview

import simula.ui._
import simula.common._

/**
 * @author JC
 *
 */
class GUIView extends UIInterface{

	def buildView = println("GUIVIEW buildView Called")
	def redefineView = println("GUIVIEW RedefineView Called")
	def updateView (d: RetrievedInformationInterface) = println("GUIVIEW UpdateView Called")

}