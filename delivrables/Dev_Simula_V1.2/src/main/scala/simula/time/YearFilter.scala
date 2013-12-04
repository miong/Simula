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

import main.scala.simula.common.YearListener

class YearFilter extends YearFilterInterface {
  var year: Integer = TimeDefinition.n_year
  var cpt: Integer = 0;
  var filters: List[YearListener] = Nil;

  def receiveTop(): Unit = {
    cpt = cpt + 1;
    if (cpt == year) {
      cpt = 0;
      sendYear();
    }
  }

  def register(yl: YearListener): Unit = {
    filters = yl :: filters;
  }

  def sendYear(): Unit = {
    for (yl <- filters)
      yl.evenOnYear();
  }

}