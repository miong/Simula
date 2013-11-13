/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * ui.textview
 * TextView.scala
 * (c) Simula. on 6 nov. 2013 00:03:01
 * By JC
 * Update 6 nov. 2013 00:03:01
 *
 * *******************************************************
 */
package main.scala.simula.ui.textview

import main.scala.simula.ui._
import main.scala.simula.common._
import main.scala.simula.ui.InterfaceType._
import Array._;
/**
 * @author JC
 *
 */
class TextView(ri: RetrievedInformationInterface,
  ae: AbstractEngine,
  size: Size, loc: Location) extends UIInterface {
  var maxSize = size
  var actualLocation = loc
  var engine = ae
  var actualState = ri

  def redefineView = println("CLIVIEW RedefineView Called")
  def updateView(d: RetrievedInformationInterface) = {
    //var vl = ri.getViewables
    println("Nombre d'habitants:"
      + actualState.getNumberOfCitizen()
      + " | Taux de criminalite:"
      + actualState.getGlobalCriminality()
      + " | Taux de pollution:"
      + actualState.getGlobalPolution())
      
     //RetrievedInformationInterface.getViewable --> un tableau de Viewable
     var viewables:Set[Viewable] =d.getViewable();
     //Construire un tableau de char de la bonne dimension
    var s:Size=new Size(10,10) //retrouver la vraie taille: un des viewables est une map
    var tab = ofDim[Char](s.length, s.width)
    for (a <- 0 until s.length) {
    	for (b <- 0 until s.width) {
    		tab(a)(b) = new Box(new Location(a, b))
    	}
    }
     //le remplir aux bons endroits avec des carctères en fonction des view: String des Viewables 
     //l'afficher
  }
}