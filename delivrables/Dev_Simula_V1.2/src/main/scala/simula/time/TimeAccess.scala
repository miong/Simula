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
package main.scala.simula.time

import main.scala.simula.common.MonthListener

import main.scala.simula.common.YearListener

trait TimeAccess {

  def buildTimeManager(): Unit;
  def registerMonthListener(ml: MonthListener): Unit;
  def registerYearListener(ml: YearListener): Unit;
  def startTime(): Unit;

}