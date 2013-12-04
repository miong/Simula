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

import main.scala.simula.ui.tuiview._
import main.scala.simula.ui.cliview.CLIView
import main.scala.simula.ui.guiview.GUIView
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

    it match {
      //QUESTION: la taille de la map est fournie comment à la construction? C'est l'Engine qui la donne?

      case TEXT =>
        return new TUIView(ri, ae, new Size(10, 10), new Location(0, 0))

      case CLI =>
        return new CLIView(ri, ae, new Size(10, 10), new Location(0, 0))

      case GUI =>
        return new GUIView(ri, ae, new Size(10, 10), new Location(0, 0))
    }
  }

}