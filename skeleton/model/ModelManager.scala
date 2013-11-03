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
	var playerModelManager:PlayerModelManager;
	var TimeModelManager:TimeModelManager;
	
	/*
	def retrievedGlobalCriminality():Int={
		return 0;
	}
	def retrievedGlobalPolution():Int={
		return 0;
	}
	def retrieveNumberOfCitizens():Int={
		return cityModelManager.retrievedNumberOfCitizens;
	}
	*/
	def giveCityAccess():CityAccess={
	  return cityModelManager.giveCityAccess();
	}
	def givePlayerAccess():PlayerAccess;
	def giveTimeAccess():TimeAccess;
	
	def ModelManager(){
	  cityModelManager=new CityModelManager();
	  playerModelManager=new PlayerModelManager();
	  TimeModelManager=new TimeModelManager();
	}
}