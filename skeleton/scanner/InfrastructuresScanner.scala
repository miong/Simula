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
package model.scanner

/**
 * @author Bubul
 *
 */
import model.city._
import model._

trait InfrastructuresScanner {
	
  def getInfrastructures(model:Model):Set[Infrastructure]={
	  var infra = Set[Infrastructure]()
	  val map:Array[Array[Box]] = model.giveCityAccess.getMapAccess.tab
	  for(ab:Array[Box] <- map;b:Box <- ab;i:Infrastructure <- b.infrastructures){
	    infra += i
	  }
	  return infra
	}
}