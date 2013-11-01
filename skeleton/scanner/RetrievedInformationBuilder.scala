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
package scanner

/**
 * @author Bubul
 *
 */
class RetreivedInformationBuilder(scanner : GeneralScannerInterface) extends RetreivedInformationBuilderInterface{
	
  def build():RetreivedInformation = {
    val nCitizen = scanner.ScanNumberOfCitizens()
    val nGlobalPolution = scanner.ScanGlobalPolution()
    val nGlobalCriminality = scanner.ScanGlobalCriminality()
    
    return new RetreivedInformation(nCitizen,nGlobalPolution,nGlobalCriminality)
  }
}