/***********************************************************
 *                         Simula                          *
 * *********************************************************
 * ui.textview
 * TextView.scala
 * (c) Simula. on 6 nov. 2013 00:03:01
 * By JC
 * Update 6 nov. 2013 00:03:01
 *
 *********************************************************/
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
    var viewables: Set[Viewable] = d.getViewables();

    //Construire un tableau de char de la bonne dimension
    //var map:Viewable=viewables.find(v:Viewable => v.priority()==0)
    //var mapSize:Size=map.getSize()
    /*FAKE*/ var mapSize = new Size(10, 10)

    var tab = ofDim[Char](mapSize.length, mapSize.width)
    /*FAKE*/ for (i <- 0 to mapSize.length) {
      for (j <- 0 to mapSize.width) {
        tab(i)(j) = 'B';
      }
    }

    //le remplir aux bons endroits avec des caractères en fonction des view: String des Viewables 
    //TODO: prendre en compte la priorité
    /*FAKE*/ for (i <- 0 to mapSize.length) {
      for (j <- 0 to mapSize.width) {
        tab(i)(j) = 'B';
      }
    }
    //viewables.foreach(v:Viewable => {tab(v.getLocation().x)(v.getLocation().y)=findChar(v.view())})

    //l'afficher
    for (a <- 0 until mapSize.length) {
      for (b <- 0 until mapSize.width) {
        print(tab(a)(b))
        print(" ")
      }
      print("\n")
    }
  }
  
  def findChar(str: String): Char = {
    (str.split(" "))(0) match {

      case "Network" =>
        return 'N'
      case "ElectricGrid" =>
        return 'E'
      case "TransportWays" =>
        return 'W'

      case "Plant" =>
        return 'P'
      case "Station" =>
        return 'S'
      case "TransportCenter" =>
        return 'T'
      case "Area" =>
        return 'A'
      case "box" =>
        return 'B'

    }
  }

}