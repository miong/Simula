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
package main.scala.simula.model.time

class TimeManager extends TimeAccess {

  var time: Time = null
  var builder: TimeBuilderInterface = new TimeBuilder()

  def buildTimeManager(): Unit = {
    if (time != null) {
      time = builder.build();
    }
  }
  def registerMonthListener(ml: MonthListener): Unit = {
    time.registerMonthListener(ml)
  }

  def registerYearListener(yl: YearListener): Unit = {
    time.registerYearListener(yl)
  }

  def startTime(): Unit = {
    time.startTime();
  }

}