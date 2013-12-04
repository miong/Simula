/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * simula.common
 * EventInterface.scala
 * (c) Simula. on 6 nov. 2013 01:36:08
 * By JC
 * Update 6 nov. 2013 01:36:08
 *
 * *******************************************************
 */
package main.scala.simula.common

import main.scala.simula.common.StructureType._
import main.scala.simula.common.ActionType._

/**
 * @author JC
 *
 */
abstract case class ActionInterface {
  var where: Location = new Location(0,0)
  var size: Size = new Size(1,1)
  var what: StructureType = NOTHING
  var actionType: ActionType = NOA
}