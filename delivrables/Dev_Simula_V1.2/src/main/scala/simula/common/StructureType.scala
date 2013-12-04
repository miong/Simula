/**
 * *******************************************************
 * SimulaGame
 * main.scala.simula.model.city
 * EnumType.scala
 * (c)SimulaGame on 17 nov. 2013 19:33:01
 * By ken
 * Update 17 nov. 2013 19:33:01
 * *******************************************************
 */
package main.scala.simula.common

/**
 * @author ken
 *
 */
object StructureType extends Enumeration {
  type StructureType = Value
  val TRANSPORT, AREA, PLANT, ROAD, STATION, NOTHING = Value
}