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
package model.scanner

/**
 * @author Bubul
 *
 */
import model._
import model.city._

trait CriminalityScanner extends InfrastructuresScanner{
	var model : Model
	
	def ScanGlobalCriminality : Integer = {
		var crim:Integer = 0;
  		var infra = getInfrastructures(model)
  		for(i:Infrastructure <- infra){
  			crim += i.population.getNumberOfCitizens
  		}
  		return crim;
	}
}