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

import main.scala.simula.model.Mesure

class Player extends PlayerAccess {
	
  var money:Money = new Money()
	
	def getMoneyAmount():Integer={
	  return money.getValue.toInt
	}
	
	def addToMoney(sum:Integer)={
	  money.setValue(money.getValue+sum)
	}
	def retrieveMoney(sum:Integer)={
	  money.setValue(money.getValue-sum)
	  
	}
}