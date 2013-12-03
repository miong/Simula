/**
 * *******************************************************
 * simula-project
 * main.scala.simula.ui.tuiview
 * TextDisplay.scala
 * (c)simula-project on 18 nov. 2013 10:20:05
 * By Scarpe
 * Update 18 nov. 2013 10:20:05
 * *******************************************************
 */
package main.scala.simula.ui.tuiview

import main.scala.simula.common._
import Array._
import main.scala.simula.ui._
import main.scala.simula.model.city.Plant
import main.scala.simula.model.city.Station
import main.scala.simula.model.city.TransportCenter
import main.scala.simula.model.city.Area
/**
 * @author Scarpe
 *
 */
trait TUIDisplay extends DisplayInterface {

  def updateDisplay(d: RetrievedInformationInterface, actualState: RetrievedInformationInterface) {

    println("Tresorerie: "
      + d.getAmountOfMoney()
      + " | Nombre d'habitants:"
      + d.getNumberOfCitizen()
      + " | Taux de criminalite:"
      + d.getGlobalCriminality()
      + " | Taux de pollution:"
      + d.getGlobalPolution())

    var viewables: Set[Viewable] = d.getViewables();
    var map: Viewable = viewables.find({ v: Viewable => v != null && v.priority == 0 }).get
    var mapSize: Size = map.getSize

    var tab = ofDim[Viewable](mapSize.length, mapSize.width)
    for (i <- 0 until mapSize.length; j <- 0 until mapSize.width)
      tab(i)(j) = null

    viewables.foreach(v => {
      if (tab(v.getLocation.x)(v.getLocation.y) == null || tab(v.getLocation.x)(v.getLocation.y).priority < v.priority) {
        //tab( v.getLocation.x )( v.getLocation.y )=v;
        for (a <- 0 until v.getSize.length; b <- 0 until v.getSize.width) {
          if(tab(v.getLocation.x + a)(v.getLocation.y + b)==null || tab(v.getLocation.x + a)(v.getLocation.y + b).priority < v.priority)
        	  tab(v.getLocation.x + a)(v.getLocation.y + b) = v
        }
      }
    })

    // POUR KENNY : NE SERAIT'IL PAS JUDICIEUX D'UTILISE LA SIZE DE L'OBJET ?? 
    // JE NE SAVAIS PAS QUE C'ETAIT A LA VUE DE DECLARER LA TAILLE DES OBJETS...
    // DE PLUS J'AI ESSAYER DE RUN -> ERREUR POUR UN MATCH AVEC EARTH... TA ESSAYER DE RUN ???    							
    //    for (a <- 0 until mapSize.length) {
    //    	for (b <- 0 until mapSize.width) {
    //    	  var str: String=tab(a)(b).view
    //    	  (str.split((" "))(0) match{
    //    	   case "Plant" =>
    //    			if (tab(a)(b).getLocation.x > -1  && tab(a)(b).getLocation.y > -1){
    //    	    		for (i<-1 until 3){
    //    	    		  tab (a+i)(b)=new Plant(new Location(-1,-1))
    //    	    		  tab (a)(b+i)=new Plant(new Location(-1,-1))
    //    	    		}
    //    	    		for (i<-1 until 3){
    //    	    		  for (j<-1 until 3){
    //    	    		    tab(a+i)(b+j)=new Plant(new Location(-1,-1))
    //    	    		  }
    //    	    		}
    //    	  		}
    //    		case "Station" =>
    //    			if (tab(a)(b).getLocation.x > -1  && tab(a)(b).getLocation.y > -1){
    //    	    		for (i<-1 until 3){
    //    	    		  tab (a+i)(b)=new Station(new Location(-1,-1))
    //    	    		  tab (a)(b+i)=new Station (new Location(-1,-1))
    //    	    		}
    //    	    		for (i<-1 until 3){
    //    	    		  for (j<-1 until 3){
    //    	    		    tab(a+i)(b+j)=new Station(new Location(-1,-1))
    //    	    		  }
    //    	    		}
    //    	  		}
    //    		case "TransportCenter" =>
    //    			if (tab(a)(b).getLocation.x > -1  && tab(a)(b).getLocation.y > -1){
    //    	    		for (i<-1 until 7){
    //    	    		  tab (a+i)(b)=new TransportCenter (new Location(-1,-1))
    //    	    		  tab (a)(b+i)=new TransportCenter (new Location(-1,-1))
    //    	    		}
    //    	    		for (i<-1 until 7){
    //    	    		  for (j<-1 until 7){
    //    	    		    tab(a+i)(b+j)=new TransportCenter (new Location(-1,-1))
    //    	    		  }
    //    	    		}
    //    	  		}
    //    		case "Area" =>
    //    			if (tab(a)(b).getLocation.x > -1  && tab(a)(b).getLocation.y > -1){
    //    	    		for (i<-1 until 3){
    //    	    		  tab (a+i)(b)=new Area(new Location(-1,-1))
    //    	    		  tab (a)(b+i)=new Area (new Location(-1,-1))
    //    	    		}
    //    	    		for (i<-1 until 3){
    //    	    		  for (j<-1 until 3){
    //    	    		    tab(a+i)(b+j)=new Area (new Location(-1,-1))
    //    	    		  }
    //    	    		}
    //    	  		}
    //    	  }
    //    	)}
    //    }							

    println("\n")
    for (a <- 0 until mapSize.length) {
      for (b <- 0 until mapSize.width) {
        print(writeChar((tab(a)(b))))
        print(" ")
      }
      print("\n")
    }
    println("\n\n\n")
  }
  
  def printError(err:String):Unit = {
    println(err)
  }
  
  def prepareSetOfViewbleToDisplay(tab: Viewable) = {

  }
  
  def printSyntaxe():Unit = {
    println("Syntaxe incorrecte.")
    println("La syntaxe appropriée est de la forme:")
    println("ACTION WHERE [WHAT]")
    println("Où :")
    println("ACTION peut être : CONSTRUCT/DESTROY")
    println("WHERE est de la forme: x,y")
    println("WHAT a mentionné pour CONSTRUCT ne peut étre pour le moment que AREA")
  }	

  def writeChar(v: Viewable): Char = {
    if (v != null) {
      var str: String = v.view
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
        case "EARTH" =>
          return '#'
        case "WATER" =>
          return '~'
        case "TREE" =>
          return '^'
        case "STONE" =>
          return 'o'
        case "GRASS" =>
          return ';'
        case "Map" =>
          return 'M'
        case _ =>
          println(str)
          return 'U';
      }

    }
    return 'U'
  }

}