/**
 * *******************************************************
 * Simula
 * simula.model.time
 * YearFilterInterface.scala
 * (c)Simula on 5 nov. 2013 19:07:03
 * By Bubul
 * Update 5 nov. 2013 19:07:03
 * *******************************************************
 */
package main.scala.simula.model.time

/**
 * @author Bubul
 *
 */
trait YearFilterInterface extends TimeFilter {

  def register(yl: YearListener): Unit;
  def sendYear(): Unit;

}