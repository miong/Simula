/**
 * *******************************************************
 * Simula
 * scanner
 * CriminalityScanner.scala
 * (c)Simula on 30 oct. 2013 11:21:34
 * By Bubul
 * Update 30 oct. 2013 11:21:34
 * *******************************************************
 */
package scanner

/**
 * @author Bubul
 *
 */
trait CriminalityScanner {
	var model : Model
	
	def ScanGlobalCriminality : Integer = {
	  return model.retrievedGlobalCriminality();
	}
}