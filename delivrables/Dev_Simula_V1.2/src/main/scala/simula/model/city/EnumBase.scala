/**
 * *******************************************************
 * SimulaGame
 * main.scala.simula.model.city
 * EnumBase.scala
 * (c)SimulaGame on 17 nov. 2013 20:05:11
 * By ken
 * Update 17 nov. 2013 20:05:11
 * *******************************************************
 */
package main.scala.simula.model.city

/**
 * @author ken
 *
 */
object EnumBase extends Enumeration{
	type EnumBase = Value
	val WATER,EARTH,TREE = Value
	val size = 3
}