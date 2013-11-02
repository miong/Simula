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

import Array._;

class Map {
	var size:Size
	var value:Int;
	var polution:Int;
	var criminality:Int;
	var population:Population;
	var tab:ofDim[Box](width,length);
	
	def map(){
	  size= new Size();
	  value=0;
	  polution=0;
	  criminality=0;
	  population=new Population();
	  tab=new Array[Array[Box]](size.length);
	  
	}
	
	def getNumberOfCitizens:Int={
	  return population.getNumberOfCitizens();
	}
	
}