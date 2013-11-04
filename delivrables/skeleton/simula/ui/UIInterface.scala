/**********************************************************
 *                        Simula                          *
 **********************************************************
 * simula.ui
 * ViewsInterface.scala
 * (c) Simula. on 30 oct. 2013 11:30:05
 * By JC
 * Update 30 oct. 2013 11:30:05
 *
 *********************************************************/
package simula.ui

import simula.common.SimulaData


/**
 * @author JC
 *
 */
abstract case class UIInterface extends BuildView{
	def buildView
	def redefineView
	def updateView (d: SimulaData)
	
}