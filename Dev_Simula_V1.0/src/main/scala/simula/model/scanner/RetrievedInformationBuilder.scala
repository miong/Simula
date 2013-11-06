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
class RetrievedInformationBuilder(scanner : GeneralScannerInterface) extends RetrievedInformationBuilderInterface{
	
  def build():RetrievedInformation = {
    val nCitizen = scanner.ScanNumberOfCitizens()
    val nGlobalPolution = scanner.ScanGlobalPolution()
    val nGlobalCriminality = scanner.ScanGlobalCriminality()
    
    return new RetrievedInformation(nCitizen,nGlobalPolution,nGlobalCriminality)
  }
}