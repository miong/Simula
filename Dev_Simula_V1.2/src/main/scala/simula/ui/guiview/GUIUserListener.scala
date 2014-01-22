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
import javax.swing._
import main.scala.simula.common.StructureType._
import main.scala.simula.common.ActionType._
/**
 * @author Scarpe
 *
 */
trait GUIUserListener extends UserListenerInterface with ActionListener{

  val destroy : JButton;
  val areaB : JButton;
  val roadB : JButton;
  val residenceB : JButton;
  val electricLineB : JButton;
  val powerPlantB : JButton;
  val policeCenterB : JButton;
  
  var actBuilder:ActionBuilder = new ActionBuilder()
  var engine:AbstractEngine
  var where: Location = new Location(0,0)
  var what: StructureType = NOTHING
  var actionType: ActionType = NOA
  
  def actionPerformed(arg:ActionEvent):Unit = {
    val src = arg.getSource()
    ActionType.maxId
    if (src == destroy) {
      actionType = DESTROY
    } else if (src == areaB) {
      actionType = CONSTRUCT
      what = AREA
    } else if (src == roadB) {
      actionType = CONSTRUCT
      what = ROAD
    } else if (src == electricLineB) {
      actionType = CONSTRUCT
      what = ELECTRICLINE
    } else if (src == residenceB) {
      actionType = CONSTRUCT
      what = RESIDENCE
    } else if (src == powerPlantB) {
      actionType = CONSTRUCT
      what = POWERPLANT
    } else if (src == policeCenterB) {
      actionType = CONSTRUCT
      what = POLICECENTER
    } else if (src.isInstanceOf[Button]) {
      val but:Button = src.asInstanceOf[Button]
      if(actionType == NOA){
        // SHOW DETAIL ON THE ZONE
      }else{
        where = new Location(but.getPosX,but.getPosY);
        if (actionType==CONSTRUCT)
          engine.newAction(actBuilder.build(actionType,what,where))
        else
          engine.newAction(actBuilder.build(actionType,where))
      }
    }
  }
  
}