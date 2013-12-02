/**
 * *******************************************************
 * Simula
 * scanner
 * Test.scala
 * (c)Simula on 30 oct. 2013 11:17:58
 * By Bubul
 * Update 30 oct. 2013 11:17:58
 * *******************************************************
 */
package main.scala.simula.model.scanner

import main.scala.simula.model._
import main.scala.simula.common._
import main.scala.simula.model.city.Infrastructure

trait GeneralScannerInterface {

  var model: ModelInterface = null

  def ScanNumberOfCitizens(loc:Location,siz:Size): Integer
  def ScanGlobalPolution(loc:Location,siz:Size): Integer
  def ScanGlobalCriminality(loc:Location,siz:Size): Integer
  def scanViewableObjects(loc:Location,siz:Size): Set[Viewable]
  def scanInfrastructures(loc:Location,siz:Size):Set[Infrastructure]

}

