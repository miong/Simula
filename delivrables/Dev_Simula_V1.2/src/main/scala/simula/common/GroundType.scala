/**
 * *******************************************************
 * Simula
 * main.scala.simula.model.city
 * GroundType.scala
 * (c)SimulaGame on 17 nov. 2013 20:05:11
 * By ken
 * Update 17 nov. 2013 20:05:11
 * *******************************************************
 */
package main.scala.simula.common

/**
 * @author ken
 *
 */
object GroundType extends Enumeration {
  type GroundType = Value
  val WATER, EARTH, TREE, GRASS, STONE, FAIRY = Value
  val size = 5;
}