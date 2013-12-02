/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.common
 * ActionType.scala
 * (c)Simula_Dev1.0 on 28 nov. 2013 17:31:29
 * By Bubul
 * Update 28 nov. 2013 17:31:29
 * *******************************************************
 */
package main.scala.simula.common

/**
 * @author Bubul
 *
 */
object ActionType extends Enumeration {
  
  type ActionType = Value
  val QUIT,NOA,CONSTRUCT, DESTROY = Value
  val size = 2;

}