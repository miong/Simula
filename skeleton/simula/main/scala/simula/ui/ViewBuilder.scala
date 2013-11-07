/**
 * *******************************************************
 *               		Simula                           *
 * ********************************************************
 * simula.ui
 * ViewBuilder.scala
 * (c) Simula. on 6 nov. 2013 01:02:53
 * By JC
 * Update 6 nov. 2013 01:02:53
 *
 * *******************************************************
 */
package main.scala.simula.ui

import main.scala.simula.ui.textview.TextView
import main.scala.simula.ui.InterfaceType._
import main.scala.simula.common._
/**
 * @author JC
 *
 */
class ViewBuilder extends ViewBuilderInterface {
  def buildView(it: InterfaceType,
    ae: AbstractEngine,
    ri: RetrievedInformationInterface): UIInterface = {
    val view = new TextView(ri, ae, new Size(10, 10), new Location(0, 0))
    view
  }

}