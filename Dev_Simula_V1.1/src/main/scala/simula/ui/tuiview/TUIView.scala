/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * main.scala.simula.ui.tuiview
 * TextView.scala
 * (c) Simula. on 6 nov. 2013 00:03:01
 * By JC
 * Update 6 nov. 2013 00:03:01
 *
 * *******************************************************
 */
package main.scala.simula.ui.tuiview

import main.scala.simula.ui._
import main.scala.simula.common._
import main.scala.simula.ui.InterfaceType._
import Array._;
/**
 * @author JC
 *
 */
class TUIView(ri: RetrievedInformationInterface,
  ae: AbstractEngine,
  size: Size, loc: Location) extends UIInterface with TUIDisplay with TUIUserListener {
  var maxSize = size
  var actualLocation = loc
  var engine = ae
  var actualState = ri

  def redefineView = println("CLIVIEW RedefineView Called")

  def updateView(d: RetrievedInformationInterface) = {
    updateDisplay(d, actualState)
    actualState = d
  }

}