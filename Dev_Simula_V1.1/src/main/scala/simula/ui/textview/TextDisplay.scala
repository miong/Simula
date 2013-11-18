/**
 * *******************************************************
 * simula-project
 * main.scala.simula.ui.textview
 * TextDisplay.scala
 * (c)simula-project on 18 nov. 2013 10:20:05
 * By Scarpe
 * Update 18 nov. 2013 10:20:05
 * *******************************************************
 */
package main.scala.simula.ui.textview

import main.scala.simula.common._
import Array._;
import main.scala.simula.ui._
/**
 * @author Scarpe
 *
 */
trait TextDisplay extends DisplayInterface{
  
  def updateDisplay(d:RetrievedInformationInterface,actualState:RetrievedInformationInterface){
    //var vl = ri.getViewables
    println("Nombre d'habitants:"
      + actualState.getNumberOfCitizen()
      + " | Taux de criminalite:"
      + actualState.getGlobalCriminality()
      + " | Taux de pollution:"
      + actualState.getGlobalPolution())
      
    //obtenir les objets à représenter
    var viewables:Set[Viewable] =d.getViewables();
    //construire un tableau de char de la bonne dimension
    // /!\ gerer les erreurs si on n'obtient pas la map /!\
    var map:Viewable=viewables.find({ v:Viewable => v!=null && v.priority==0 }).get
    var mapSize:Size=map.getSize
  
    var tab = ofDim[Viewable](mapSize.length, mapSize.width)
    for(i <- 0 until mapSize.length; j <- 0 until mapSize.width)
      tab(i)(j) = null
    
    //remplir le tableau
    viewables.foreach(v => { if (tab( v.getLocation.x )( v.getLocation.y )==null || tab( v.getLocation.x )( v.getLocation.y ).priority<v.priority )
    							{tab( v.getLocation.x )( v.getLocation.y )=v }})
    
    
    //l'afficher
    println("\n")
    for (a <- 0 until mapSize.length) {
    	for (b <- 0 until mapSize.width) {
    		print(writeChar( (tab(a)(b))))
    		print(" ")
    	}
    	print("\n")
    }
    println("\n\n\n")
  }
  
  
   def writeChar(v:Viewable): Char={
     if (v != null){
       var str:String=v.view
       (str.split(" "))(0) match{
     	
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
    		case _ =>
    			return 'U'
     	}
    	
     }
     return 'U'
  }
   

}