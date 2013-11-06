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
package main.scala.simula.model.city

abstract class Infrastructure(l:Location) {
	// Default value added !! need a Builder To set them at initialisation !!
	var size:Size= new Size(0,0);
	var location:Location=l
	var polution:Int=0;
	var criminality:Int=0;
	var population: Population=new Population();
}