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
package main.scala.simula.common

class Size(l:Int,w:Int){
	var length: Int=l
	var width: Int=w
	
	/*
	def Size(length:Int,width:Int);
	*/
	
	def numberOfBoxes():Int={
	  return length*width;
	}
}