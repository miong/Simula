/**
 * *******************************************************
 * Simula
 * scanner
 * RetreivedInformationBuilder.scala
 * (c)Simula on 1 nov. 2013 13:30:59
 * By Bubul
 * Update 1 nov. 2013 13:30:59
 * *******************************************************
 */
package main.scala.simula.model.scanner
import main.scala.simula.common._

/**
 * @author Bubul
 *
 */
class RetrievedInformationBuilder(scanner: GeneralScannerInterface) extends RetrievedInformationBuilderInterface {

  def build(loc:Location,siz:Size): RetrievedInformationInterface = {
    val nCitizen = scanner.ScanNumberOfCitizens(loc,siz)
    val nGlobalPolution = scanner.ScanGlobalPolution(loc,siz)
    val nGlobalCriminality = scanner.ScanGlobalCriminality(loc,siz)
    val sViewable = scanner.scanViewableObjects(loc,siz)
    val aMoney = scanner.getAmountOfMoney()
    var ri = new RetrievedInformation(nCitizen, nGlobalPolution, nGlobalCriminality, sViewable,loc,siz,aMoney)
    return ri
  }
}