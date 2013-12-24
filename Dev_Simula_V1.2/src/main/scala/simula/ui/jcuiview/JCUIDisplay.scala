/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.ui.jcuiview
 * JCUIDisplay.scala
 * (c)Simula_Dev1.0 on 24 déc. 2013 12:41:25
 * By Bubul
 * Update 24 déc. 2013 12:41:25
 * *******************************************************
 */
package main.scala.simula.ui.jcuiview

/**
 * @author Bubul
 *
 */

import main.scala.simula.common._
import main.scala.simula.ui._
import Array._ 
import jcurses.system._
import jcurses.widgets._


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

trait JCUIDisplay extends DisplayInterface {

  val copyrigth:Char = 0x00A9
  var win:Window = _
  
  def constructWindows() = {
    win = new Window(100, 100, true, "Simula - SIMcity UnofficiaL Apps");
    val mgr:DefaultLayoutManager = new DefaultLayoutManager();
    mgr.bindToContainer(win.getRootPanel());
    win.show();
  }
  constructWindows();
  
  
  def introDisplay():Unit = {
  } 
  
  
  def outroDisplay():Unit = {
  }
  
  def clearDisplay() = 1+1;

  def updateDisplay(d: RetrievedInformationInterface, actualState: RetrievedInformationInterface) {

  }
  
  def printError(err:String):Unit = {
    
  }
  
  def prepareSetOfViewbleToDisplay(tab: Viewable) = {

  }
  
  def printSyntaxe():Unit = {
    
  }	


}