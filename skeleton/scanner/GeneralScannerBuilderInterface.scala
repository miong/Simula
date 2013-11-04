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
package model.scanner
import model._ 

abstract class GeneralScannerBuilderInterface {
  
	def ScannerBuilder(m:Model):GeneralScannerInterface
	
}