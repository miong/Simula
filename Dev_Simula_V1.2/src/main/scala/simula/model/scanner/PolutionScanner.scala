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
package main.scala.simula.model.scanner
import main.scala.simula.model._
import main.scala.simula.model.city._
import main.scala.simula.common._

/**
 * @author Bubul
 *
 */
trait PolutionScanner extends InfrastructuresScanner {
  var model: ModelInterface

  def ScanGlobalPolution(loc:Location,siz:Size): Integer = {
    var pol: Integer = 0;
    var infra = getInfrastructures(model,loc,siz)
    for (i: Infrastructure <- infra) {
      pol += i.polution.getValue.toInt
    }
    return pol;
  }

}