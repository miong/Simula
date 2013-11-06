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
package simula.model.time

trait TimeAccess {
	
	def buildTimeManager():Unit;
	def registerMonthListener(ml:MonthListener):Unit;
	def registerYearListener(ml:YearListener):Unit;
	def startTime():Unit;
  
}