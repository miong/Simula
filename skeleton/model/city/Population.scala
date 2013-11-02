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

class Population {
	var numberOfCitizens:Int;
	
	def setNumberOfCitizens(newNumberOfCitizens:Int)={
	  numberOfCitizens=newNumberOfCitizens;
	}
	def getNumberOfCitizens():Int={
	  return numberOfCitizens;
	}
}