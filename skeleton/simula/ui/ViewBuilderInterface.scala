/*********************************************************
 *               		 Simula                          *
 *********************************************************
 * simula.ui
 * ViewBuilderInterface.scala
 * (c) Simula. on 6 nov. 2013 01:02:23
 * By JC
 * Update 6 nov. 2013 01:02:23
 *
 *********************************************************/
package simula.ui

import simula.common._
import simula.ui.InterfaceType._
/**
 * @author JC
 *
 */
abstract class ViewBuilderInterface {
	def buildView(it: InterfaceType, ae: AbstractEngine): UIInterface
}