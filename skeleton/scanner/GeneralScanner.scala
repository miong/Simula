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

class GeneralScanner extends GeneralScannerInterface with CriminalityScanner with NetworkScanner with PolutionScanner with PopulationScanner{
  

}

object GeneralScanner {

  def GeneralScannerBuilder(m:Model,e:Engine):GeneralScannerInterface = {
	  var gs = new GeneralScanner()
	  gs.model = m
	  gs.engine = e
	  return gs
 }
  
}