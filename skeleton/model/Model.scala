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
package model

abstract class Model {
	/*on oublie �a, ok, � la place je donne acc�s aux interfaces des elements
	def retrievedGlobalCriminality():Int;
	def retrievedGlobalPolution():Int;
	def retrieveNumberOfCitizens():Int;
   */	
	def giveCityAccess():CityAccess;
	def givePlayerAccess():PlayerAccess;
	def giveTimeAccess():TimeAccess;
	
}