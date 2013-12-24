/**
 * *******************************************************
 * simula-project
 * main.scala.simula.ui.guiview
 * GUIUserListener.scala
 * (c)simula-project on 18 nov. 2013 10:37:01
 * By Scarpe
 * Update 18 nov. 2013 10:37:01
 * *******************************************************
 */
package main.scala.simula.ui.guiview

import main.scala.simula.common._
import main.scala.simula.ui._
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
/**
 * @author Scarpe
 *
 */
trait GUIUserListener extends UserListenerInterface with ActionListener{

  def actionPerformed(arg:ActionEvent):Unit = {
    
  }
  
}