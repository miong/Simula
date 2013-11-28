/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.ui
 * ActionBuilder.scala
 * (c)Simula_Dev1.0 on 28 nov. 2013 18:02:29
 * By Bubul
 * Update 28 nov. 2013 18:02:29
 * *******************************************************
 */
package main.scala.simula.ui

import main.scala.simula.common._
import main.scala.simula.common.StructureType._

/**
 * @author Bubul
 *
 */
class ActionBuilder {
  
  def build(atype:ActionType,thing:StructureType,loc:Location):ActionInterface = {
    return new ActionInterface(){
      var size = new Size(1,1);
      var where = loc;
      var what = thing;
      var actionType = atype
    }
  }
  
  def build(atype:ActionType,loc:Location):ActionInterface = {
    return new ActionInterface(){
      var size = new Size(1,1);
      var where = loc;
      var what = NOTHING;
      var actionType = atype
    }
  }

}