/**
 * *******************************************************
 * SimulaGame
 * main.scala.simula.model.city
 * Mesure.scala
 * (c)SimulaGame on 17 nov. 2013 20:08:21
 * By ken
 * Update 17 nov. 2013 20:08:21
 * *******************************************************
 */
package main.scala.simula.model

/**
 * @author ken
 *
 */
abstract class Mesure {
	var value : Double = 0.0
	
	def getValue():Double={
	  return value
	}
	
	def setValue(d:Double)={
	  value=d
	}
}