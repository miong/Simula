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

import simula.common.Size

class City(s:Size) extends CityAccess{
	var map:Map=new Map(s)
  
	def getMapAccess():Map ={
	  return map;
	}
	
	/*
	def getNumberOfCitizens():Int={
	  return map.getNumberOfCitizens;
	}*/
}
