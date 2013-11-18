/**
 * ********************************************************
 * Simula
 * simula.model.scanner
 * mapScanner.scala
 * (c)Simula on 4 nov. 2013 15:34:20
 * By Bubul
 * Update 4 nov. 2013 15:34:20
 * *******************************************************
 */
package main.scala.simula.model.scanner
import main.scala.simula.model._
import main.scala.simula.model.city._
import main.scala.simula.common._

/**
 * @author Bubul
 *
 */

trait DisplayScanner extends InfrastructuresScanner{

  var model: ModelInterface

  def scanViewableObjects(): Set[Viewable] = {
    var rval = Set[Viewable]()
    val infra = getInfrastructures(model)
    for (i: Infrastructure <- infra) {
    	rval += i
    }
    val s = model.giveCityAccess.mapSize
    for(i <- 0 to s.length; j <- 0 to s.width)
    		rval += model.giveCityAccess.getBoxAt(new Location(i,j))
    return rval
  }

}