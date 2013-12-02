/**
 * *******************************************************
 * simula-project
 * main.scala.simula.ui
 * DisplayInterface.scala
 * (c)simula-project on 18 nov. 2013 10:19:30
 * By Scarpe
 * Update 18 nov. 2013 10:19:30
 * *******************************************************
 */
package main.scala.simula.ui

import main.scala.simula.common._

/**
 * @author Scarpe
 *
 */
trait DisplayInterface {
  def updateDisplay(d: RetrievedInformationInterface, actualState: RetrievedInformationInterface)
}