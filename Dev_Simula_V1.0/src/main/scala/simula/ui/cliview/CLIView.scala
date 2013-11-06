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
package main.scala.simula.ui.cliview

import main.scala.simula.ui.UIInterface
import main.scala.simula.common._

/**
 * @author JC
 *
 */
class CLIView extends UIInterface {

	def buildView = println("CLIVIEW buildView Called")
	def redefineView = println("CLIVIEW RedefineView Called")
	def updateView (d: RetrievedInformationInterface) = println("CLIVIEW UpdateView Called")

}