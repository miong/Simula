/**
 * *******************************************************
 * Simula
 *
 * test2.scala
 * (c)Simula on 30 oct. 2013 11:19:05
 * By Scarpe
 * Update 30 oct. 2013 11:19:05
 * *******************************************************
 */
/**
 * @author Scarpe
 *
 */
package main.scala.simula.model
import main.scala.simula.model.city.CityAccess
import main.scala.simula.model.player.PlayerAccess
import main.scala.simula.model.scanner._
import main.scala.simula.common.RetrievedInformationInterface

class ModelManager extends ModelInterface {

  var cityModelManager: CityModelManager = new CityModelManager();
  var playerModelManager: PlayerModelManager = new PlayerModelManager();
  var scannerBuilder: GeneralScannerBuilderInterface = new GeneralScannerBuilder()
  var generalScanner: GeneralScannerInterface = scannerBuilder.ScannerBuilder(this)
  var infoBuilder: RetrievedInformationBuilderInterface = new RetrievedInformationBuilder(generalScanner)

  def giveInformations(): RetrievedInformationInterface = {
    return infoBuilder.build()
  }

  def giveCityAccess(): CityAccess = {
    return cityModelManager.giveCityAccess();
  }
  def givePlayerAccess(): PlayerAccess = {
    //return playerModelManager.givePlayerAccess();
    return null
  }
}