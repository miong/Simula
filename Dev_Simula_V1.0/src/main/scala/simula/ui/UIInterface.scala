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
package main.scala.simula.ui


import main.scala.simula.common._
import main.scala.simula.ui.InterfaceType._
/**
 * @author JC
 *
 */
abstract case class UIInterface{
  var engine: AbstractEngine
  var maxSize: Size
  var actualLocation: Location
  var actualState: RetrievedInformationInterface
  def redefineView
  def updateView (d: RetrievedInformationInterface)
	
}