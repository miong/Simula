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
object TextAttrType extends Enumeration {
  type TextAttrType = Value
  val NONE, BOLD, UNDER, BLINK, REV, CONCEAL = Value
  def toString(t:this.TextAttrType ): String = 
    t match {
    case NONE => "Rien"
    case BOLD => "gras"
    case UNDER=> "underline"
    case BLINK=> "blink"
    case REV  => "reverse"
    case CONCEAL => "concealed"
  }

  def toASCode(t:this.TextAttrType ): String = 
    t match {
    case NONE => "1m"
    case BOLD => "1m"
    case UNDER=> "4m"
    case BLINK=> "5m"
    case REV  => "7m"
    case CONCEAL => "8m"
  }

    
}

trait TUIDisplay extends DisplayInterface {

  val copyrigth:Char = 0x00A9
  
  def introDisplay():Unit = {
    println("\n\n\n\t**********************************************************")
    println("\t**********************************************************")
    println("\n\t\t\tMikey's production present\n")
    Thread.sleep(2000)
    println("\t\t\tSimula - SIMcity UnofficiaL Apps\n")
    Thread.sleep(1000)
    println("\t\t\tA Gianas required project\n")
    Thread.sleep(1000)
    println("\t**********************************************************")
    println("\t**********************************************************\n\n\n")

    print("\nLoading:")
    System.out.flush()
    var i = 1
    while (i <= 100) {
      Thread.sleep(100)
      if (i % 10 == 0) {
        print(".")
        System.out.flush()
      }
      i += 1
    }
    println("DONE")
    println("\n\n"+
    		"    ,-\"\" \"\"-.          .-\"\" \"\"-.          \n"+
    		"  .\"         \\        /         \".          \n"+
    		" :            :      :           :          \n"+
    		" :            7,----.'           :          \n"+
    		"  `.        ,---. .---.        .'          \n"+
    		"    \"-.   ,\"  __ v __   \".  .-\"          \n"+
    		"       7 :   /  | |  \\  : <          \n"+
    		"      ;  :   :,-| |-.:  :  \\          \n"+
    		"      :   \\   \\_|_|_/   /   :          \n"+
    		"      :,--.>  ',---.`  <,--.:          \n"+
    		"      :    __ (     ) __    ;          \n"+
    		"       \".   \\  `---'  /   ,\"          \n"+
    		"         \".  \\-------/  ,\"          \n"+
    		"           \"._`.___,'_,\"          \n"+
    		"              \".___.\"          \n")
    println("\n      ----> Game loaded! <----")
    Thread.sleep(1500)
  }
  introDisplay
  
  
  def outroDisplay():Unit = {
    println("\n\nSpecial thanks to \n\n"+
    		"Carpentier Sylvain :                 Game developper\n"+
    		"Mbiada Jacques Charles :             Game developper\n"+
    		"Mion Giovanni :                      Game developper\n"+
    		"Pancarte Kenny :                     Game developper\n\n"+
    		"Gianas Yann Regis :                  HeadMaster of Mikey's production Inc.\n"+
    		"Zacchiroli Stefano :                 Head of Architecture And Design Department\n"+
    		"Varacca Daniele :                    Head of Test and Support Department\n\n"+
    		"Hayley Jane Wakenshaw :              For some mysterious ascii reason...\n\n"+
    		copyrigth+" Mikey's Production, a sheep breeding compagny located in Bretagne.\n\n\n\n"
    		)
    Thread.sleep(3000)
  }
  // Foreground
  def writeRedShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[31;" + TextAttrType.toASCode(attr) + s + "\033[m"
  def writeGreenShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[32;" + TextAttrType.toASCode(attr)  + s + "\033[m"
  def writeYellowShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[33;" + TextAttrType.toASCode(attr)  + s + "\033[m"
  def writeBlackShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[30;" + TextAttrType.toASCode(attr)  + s + "\033[m"
  def writeWhiteShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[37;" + TextAttrType.toASCode(attr)  + s + "\033[m"
  def writeMagentaShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[35;" + TextAttrType.toASCode(attr) + s + "\033[m"
  def writeCyanShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[36;" + TextAttrType.toASCode(attr) + s + "\033[m"
  def writeBlueShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[34;" + TextAttrType.toASCode(attr) + s + "\033[m"

  // Background
  def writeBRedShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[41;" + TextAttrType.toASCode(attr) + s + "\033[m"
  def writeBGreenShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[42;" + TextAttrType.toASCode(attr)  + s + "\033[m"
  def writeBYellowShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[43;" + TextAttrType.toASCode(attr)  + s + "\033[m"
  def writeBBlackShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[40;" + TextAttrType.toASCode(attr)  + s + "\033[m"
  def writeBWhiteShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[47;" + TextAttrType.toASCode(attr)  + s + "\033[m"
  def writeBMagentaShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[45;" + TextAttrType.toASCode(attr) + s + "\033[m"
  def writeBCyanShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[46;" + TextAttrType.toASCode(attr) + s + "\033[m"
  def writeBBlueShape(s: String, attr:TextAttrType.TextAttrType = TextAttrType.NONE) = "\033[44;" + TextAttrType.toASCode(attr) + s + "\033[m"
  
  def clearDisplay() = println("\033[2J\033[0m")
  def updateDisplay(d: RetrievedInformationInterface, actualState: RetrievedInformationInterface) {

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
    clearDisplay()
    println("Tresorerie : "
      + writeYellowShape(d.getAmountOfMoney().toString(), (if (d.getAmountOfMoney() <= 0 )  TextAttrType.BLINK else TextAttrType.BOLD))
      + " | Nombre d'habitants : "
      + writeGreenShape(d.getNumberOfCitizen().toString())
      + " | Taux de criminalite : "
      + writeRedShape(d.getGlobalCriminality().toString())
      + " | Taux de pollution : "
      + writeMagentaShape(d.getGlobalPolution().toString())
      + " ")

    
    println("\n")
    for (b <- 0 until mapSize.width) print(" + –")
    print("\n")
    for (a <- 0 until mapSize.length) {
      print("|")
      for (b <- 0 until mapSize.width) {
        print(" " + writeChar((tab(a)(b))) + " ")
        print("|")
      }
      print("\n")
      for (b <- 0 until mapSize.width) print(" + –")
      print("\n") 
    }
    println("\n")
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
    println("WHAT a mentionné pour CONSTRUCT ne peut être pour le moment que AREA")
  }	

  def writeChar(v: Viewable): String = {
    if (v != null) {
      var str: String = v.view
      (str.split(" "))(0) match {

        case "Network" =>
          return "N"
        case "ElectricGrid" =>
          return "E"
        case "TransportWays" =>
          return "W"
        case "Plant" =>
          return "P"
        case "Station" =>
          return "S"
        case "TransportCenter" =>
          return "T"
        case "Area" =>
          return writeCyanShape("A")
        case "EARTH" =>
          return "#"
        case "WATER" =>
          writeBlueShape("~")
        case "TREE" =>
          writeGreenShape("^")
        case "STONE" =>
          writeBlackShape("o")
        case "GRASS" =>
          writeGreenShape(";")
        case "Map" =>
          return "M"
        case _ =>
          //println(str)
          writeBlackShape("U");
      }

    }else
    writeBlackShape("U")
  }

}