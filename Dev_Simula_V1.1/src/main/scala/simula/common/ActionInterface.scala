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

/**
 * @author JC
 *
 */
abstract case class ActionInterface {
  var where: Location
  var size: Size
  var what: StructureType
  var actionType: ActionType
}