/**
 * *******************************************************
 * simula-project
 * main.scala.simula.model.scanner
 * PlayerScanner.scala
 * (c)simula-project on 3 déc. 2013 09:38:44
 * By Scarpe
 * Update 3 déc. 2013 09:38:44
 * *******************************************************
 */
package main.scala.simula.model.scanner

import main.scala.simula.model.ModelInterface

/**
 * @author Scarpe
 *
 */
trait PlayerScanner {
	var model:ModelInterface
	
	def getAmountOfMoney():Integer={
	  model.givePlayerAccess.getMoneyAmount
	}
}