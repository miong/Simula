/**
 * *******************************************************
 * Simula
 *
 * test2.scala
 * (c)Simula on 30 oct. 2013 11:19:05
 * By Scarpe
 * Update 30 oct. 2013 11:19:05
 * *******************************************************
 */
/**
 * @author Scarpe
 *
 */
package simula.model.city

trait CityAccess {
	/*
  	def getNumberOfCitizens():Int;
  	*/
	def constructAnArea(l:Location);
	def getMapAccess():Map;
}