/**********************************************************
 *                        Simula                          *
 **********************************************************
 * simula.ui.cliview
 * CLIView.scala
 * (c) Simula. on 30 oct. 2013 11:32:44
 * By JC
 * Update 30 oct. 2013 11:32:44
 *
 *********************************************************/
package simula.ui.cliview

import simula.ui.UIInterface
import simula.common._

/**
 * @author JC
 *
 */
class CLIView extends UIInterface {

	def buildView = println("CLIVIEW buildView Called")
	def redefineView = println("CLIVIEW RedefineView Called")
	def updateView (d: RetreivedInformationInterface) = println("CLIVIEW UpdateView Called")

}