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

import model.city.CityAccess

class CityModelManager {
	var cityAccess: CityAccess;
	/*
	def retrievedNumberOfCitizens:Int={
	  return cityAccess.getNumberOfCitizens()
	}
	*/
	def giveCityAccess(){
	  return cityAccess;
	}
}