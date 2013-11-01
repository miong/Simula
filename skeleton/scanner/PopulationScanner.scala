/**
 * *******************************************************
 * Simula
 * scanner
 * PopulationScanner.scala
 * (c)Simula on 30 oct. 2013 11:22:19
 * By Bubul
 * Update 30 oct. 2013 11:22:19
 * *******************************************************
 */
package scanner

/**
 * @author Bubul
 *
 */
trait PopulationScanner {
	
    var model : Model
    
	def ScanNumberOfCitizens():Integer = {
      
	  return model.retrieveNumberOfCitizens
      
	}
}