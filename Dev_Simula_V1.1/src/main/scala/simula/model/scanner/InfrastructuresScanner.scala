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
package main.scala.simula.model.scanner

/**
 * @author Bubul
 *
 */
import main.scala.simula.model.city._
import main.scala.simula.model._
import main.scala.simula.common._

trait InfrastructuresScanner {

  def getInfrastructures(model: ModelInterface, loc: Location, siz: Size): Set[Infrastructure] = {
    var infra = Set[Infrastructure]()
    val s = model.giveCityAccess.mapSize
    for (i <- 0 until siz.length; j <- 0 until siz.width) {
      for (inf <- model.giveCityAccess.getCellAt(new Location(loc.x + i, loc.y + j)).infrastructures)
        infra += inf
    }
    return infra
  }
}