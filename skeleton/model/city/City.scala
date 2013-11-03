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
package model.city

class City extends CityAccess{
	var map:Map;
  
	def city(s:Size){
	  map=new Map(s);
	}
	
	def getNumberOfCitizens():Int={
	  return map.getNumberOfCitizens;
	}
}
