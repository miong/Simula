/**
 * *******************************************************
 * Simula
 * simula.model.time
 * Time.scala
 * (c)Simula on 5 nov. 2013 19:18:01
 * By Bubul
 * Update 5 nov. 2013 19:18:01
 * *******************************************************
 */
package main.scala.simula.time

import main.scala.simula.common.MonthListener

import main.scala.simula.common.YearListener

/**
 * @author Bubul
 *
 */
class Time(c: Clock, mfi: MonthFilterInterface, yfi: YearFilterInterface) {
  var clock: Clock = c
  var monthfilter: MonthFilterInterface = mfi
  var yearfilter: YearFilterInterface = yfi

  def registerMonthListener(ml: MonthListener): Unit = {
    mfi.register(ml)
  }
  def registerYearListener(yl: YearListener): Unit = {
    yfi.register(yl)
  }

  def startTime(): Unit = {
    clock.register(mfi)
    clock.register(yfi)
    clock.start();
  }

}