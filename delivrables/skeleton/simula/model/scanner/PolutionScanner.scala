/**
 * *******************************************************
 * Simula
 * scanner
 * PolutionScanner.scala
 * (c)Simula on 30 oct. 2013 11:22:34
 * By Bubul
 * Update 30 oct. 2013 11:22:34
 * *******************************************************
 */
package simula.model.scanner
import simula.model._
import simula.model.city._

/**
 * @author Bubul
 *
 */
trait PolutionScanner extends InfrastructuresScanner {
  var model : ModelInterface
  
  def ScanGlobalPolution:Integer = {
	var pol:Integer = 0;
  	var infra = getInfrastructures(model)
    for(i:Infrastructure <- infra){
      pol += i.population.getNumberOfCitizens
    }
    return pol;
  }

}