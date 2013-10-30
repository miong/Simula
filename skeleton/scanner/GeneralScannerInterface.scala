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
package scanner

abstract class GeneralScannerInterface{
  
  var model : Model = null
  var engine : Engine = null
  
  def ScanNumberOfCitizens():Integer
}

