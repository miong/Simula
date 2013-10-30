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

class GeneralScannerBuilder extends GeneralScannerBuilderInterface {
  
  def ScannerBuilder(m:Model,e:Engine): GeneralScannerInterface = {
		 var gs : GeneralScanner = new GeneralScanner()
		 gs.model = m
		 gs.engine = e
		 return gs
  }

}