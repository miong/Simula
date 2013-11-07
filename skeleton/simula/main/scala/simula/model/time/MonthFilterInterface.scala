/**
 * *******************************************************
 * Simula
 * simula.model.time
 * MonthFilterInterface.scala
 * (c)Simula on 5 nov. 2013 18:59:01
 * By Bubul
 * Update 5 nov. 2013 18:59:01
 * *******************************************************
 */
package main.scala.simula.model.time

/**
 * @author Bubul
 *
 */
trait MonthFilterInterface extends TimeFilter {

  def register(ml: MonthListener): Unit;
  def sendMonth(): Unit;
}