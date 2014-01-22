/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.ui.jcuiview
 * JCUIView.scala
 * (c)Simula_Dev1.0 on 24 déc. 2013 12:42:03
 * By Bubul
 * Update 24 déc. 2013 12:42:03
 * *******************************************************
 */
package main.scala.simula.ui.jcuiview

import main.scala.simula.ui._
import main.scala.simula.common._
import main.scala.simula.ui.InterfaceType._
import Array._;

/**
 * @author Bubul
 *
 */
class JCUIView(ri: RetrievedInformationInterface,
  ae: AbstractEngine,
  size: Size, loc: Location) extends UIInterface with JCUIDisplay with JCUIUserListener {
  var maxSize = size
  var actualLocation = loc
  var engine = ae
  var actualState = ri
  startListening

  def redefineView = println("CLIVIEW RedefineView Called")

  def updateView(d: RetrievedInformationInterface) = {
    updateDisplay(d, actualState)
    actualState = d
  }

}