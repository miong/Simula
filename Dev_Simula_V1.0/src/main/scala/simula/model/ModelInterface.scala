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
package simula.model
import simula.model.city.CityAccess
import simula.model.player.PlayerAccess
import simula.model.time.TimeAccess

trait ModelInterface {
	/*on oublie ça, ok, à la place je donne accès aux interfaces des elements directement
	def retrievedGlobalCriminality():Int;
	def retrievedGlobalPolution():Int;
	def retrieveNumberOfCitizens():Int;
   */	
	def giveCityAccess():CityAccess;
	def givePlayerAccess():PlayerAccess;
	def giveTimeAccess():TimeAccess;
	
}
