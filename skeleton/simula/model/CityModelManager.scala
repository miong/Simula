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

import simula.model.city._

class CityModelManager{
	
	var defaultCityBuilder:CityBuilderInterface = new CityBuilder()
	var cityAccess: CityAccess= defaultCityBuilder.buildCity();
	/*
	def retrievedNumberOfCitizens:Int={
	  return cityAccess.getNumberOfCitizens()
	}
	*/
	
	def InitWith(cbi:CityBuilderInterface){
	  cityAccess=cbi.buildCity();
	}
	def giveCityAccess():CityAccess={
	  return cityAccess;
	}
}
