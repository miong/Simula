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

class Size {
	var length: Int;
	var width: Int;
	
	def Size(length:Int,width:Int);
	
	def numberOfBoxes():Int={
	  return length*width;
	}
}