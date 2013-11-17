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
package main.scala.simula.model.city

import main.scala.simula.model.city.EnumClasse

class Population extends Mesure {
  var satisfaction: Integer
  var rank: EnumClasse
 
  def setNumberOfCitizens(newNumberOfCitizens: Int) = {
    numberOfCitizens = newNumberOfCitizens;
  }
  def getNumberOfCitizens(): Int = {
    return numberOfCitizens;
  }
}