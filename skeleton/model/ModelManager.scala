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

class ModelManager extends Model{

	var cityModelManager: CityModelManager;
	
	def retrievedGlobalCriminality():Int={
		return 0;
	}
	def retrievedGlobalPolution():Int={
		return 0;
	}
	def retrieveNumberOfCitizens():Int={
		return cityModelManager.retrievedNumberOfCitizens;
	}
	
}