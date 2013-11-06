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
package simula.model.scanner

/**
 * @author Bubul
 *
 */
import simula.model._
import simula.model.city._

trait CriminalityScanner extends InfrastructuresScanner{
	var model : ModelInterface
	
	def ScanGlobalCriminality : Integer = {
		var crim:Integer = 0;
  		var infra = getInfrastructures(model)
  		for(i:Infrastructure <- infra){
  			crim += i.population.getNumberOfCitizens
  		}
  		return crim;
	}
}