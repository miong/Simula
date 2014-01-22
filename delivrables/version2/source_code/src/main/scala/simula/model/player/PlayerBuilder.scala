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
package main.scala.simula.model.player

class PlayerBuilder extends PlayerBuilderInterface {
	def build(money:Integer):PlayerAccess={
	  var p:Player=new Player
	  p.addToMoney(money)
	  return p
	}
}