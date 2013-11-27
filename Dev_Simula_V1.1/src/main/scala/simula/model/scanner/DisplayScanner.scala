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

  def scanViewableObjects(loc:Location,siz:Size): Set[Viewable] = {
    var rval: Set[Viewable] = Set.empty[Viewable]
    val infra = getInfrastructures(model,loc,siz)
    for (i: Infrastructure <- infra) {
    	rval += i
    }
    val s = model.giveCityAccess.mapSize
    for(i <- 0 until s.length; j <- 0 until s.width)
    		rval += model.giveCityAccess.getCellAt(new Location(i,j))
    rval += model.giveCityAccess.getMapAsViewabel();
    return rval
  }

}