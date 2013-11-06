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
package main.scala.simula.model.scanner
import main.scala.simula.model._
import main.scala.simula.model.city._

/**
 * @author Bubul
 *
 */
trait PopulationScanner extends InfrastructuresScanner{
	
    var model : ModelInterface
    
	def ScanNumberOfCitizens():Integer = {
      var pop:Integer = 0;
      var infra = this.getInfrastructures(model)
      for(i:Infrastructure <- infra){
        pop += i.population.getNumberOfCitizens
      }
      return pop;
	}
}