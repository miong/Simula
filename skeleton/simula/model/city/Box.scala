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

class Box(l:Location) {
	var location:Location=l
	var value:Int=0;
	var polution:Int=0;
	var criminality:Int=0;
	var infrastructures:Set[Infrastructure]=Set();
	
	def addInfrastructure(i:Infrastructure){
	  infrastructures+=i;
	}
}