/**
 * *******************************************************
 * simula-project
 * main.scala.simula.ui.cliview
 * CLIDisplay.scala
 * (c)simula-project on 18 nov. 2013 10:38:34
 * By Scarpe
 * Update 18 nov. 2013 10:38:34
 * *******************************************************
 */
package main.scala.simula.ui.cliview

import main.scala.simula.common._
import main.scala.simula.ui._
/**
 * @author Scarpe
 *
 */
trait CLIDisplay extends DisplayInterface {
  def updateDisplay(d: RetrievedInformationInterface, actualState: RetrievedInformationInterface) {
    print("TO DO")
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
  def printError(err:String):Unit = {
    println(err)
  }
}