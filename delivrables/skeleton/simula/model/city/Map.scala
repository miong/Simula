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

import Array._;

class Map(s:Size){
	var size:Size=s
	var value:Int=0
	var polution:Int=0
	var criminality:Int=0
	var population:Population = new Population()
	var tab:Array[Array[Box]] = ofDim[Box](s.length,s.width)
	
	/*
	def getNumberOfCitizens:Int={
	  return population.getNumberOfCitizens();
	}
	*/
}