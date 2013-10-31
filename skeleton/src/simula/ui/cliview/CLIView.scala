/**********************************************************
 *                        Simula                          *
 **********************************************************
 * simula.ui
 * simula.ui.cliview
 * CLIView.scala
 * (c) Simula. on 30 oct. 2013 11:32:44
 * By JC
 * Update 30 oct. 2013 11:32:44
 *
 *********************************************************/
package simula.ui.cliview

import simula.ui.ViewInterface
import simula.common.SimulaData

/**
 * @author JC
 *
 */
class CLIView extends ViewInterface {

	def buildView = println("CLIVIEW buildView Called")
	def redefineView = println("CLIVIEW RedefineView Called")
	def updateView (d: SimulaData) = println("CLIVIEW UpdateView Called")

}