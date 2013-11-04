/**
 * *******************************************************
 * Simula
 * model.scanner
 * InfrastructuresScanner.scala
 * (c)Simula on 3 nov. 2013 18:53:21
 * By Bubul
 * Update 3 nov. 2013 18:53:21
 * *******************************************************
 */
package simula.model.scanner

/**
 * @author Bubul
 *
 */
import simula.model.city._
import simula.model._

trait InfrastructuresScanner {
	
  def getInfrastructures(model:ModelInterface):Set[Infrastructure]={
	  var infra = Set[Infrastructure]()
	  val map:Array[Array[Box]] = model.giveCityAccess.getMapAccess.tab
	  for(ab:Array[Box] <- map;b:Box <- ab;i:Infrastructure <- b.infrastructures){
	    infra += i
	  }
	  return infra
	}
}