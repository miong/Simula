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
import main.scala.simula.model.city._
import main.scala.simula.model.player.PlayerAccess
import main.scala.simula.model.scanner._
import main.scala.simula.common._
import main.scala.simula.common.StructureType._
import main.scala.simula.model.rules.RulesAccess

class ModelManager extends ModelInterface {

  var cityModelManager: CityModelManager = new CityModelManager();
  var playerModelManager: PlayerModelManager = new PlayerModelManager();
  var scannerBuilder: GeneralScannerBuilderInterface = new GeneralScannerBuilder()
  var generalScanner: GeneralScannerInterface = scannerBuilder.ScannerBuilder(this)
  var infoBuilder: RetrievedInformationBuilderInterface = new RetrievedInformationBuilder(generalScanner)
  val screenShotBuilder = new MapScreenShotBuilder(this)
  var effects:Set[SideEffectInterface] = Set()
  def getScreenShot():MapScreenShotInterface = {
    return screenShotBuilder.build
  }
  
  def giveInformations(): RetrievedInformationInterface = {
    return infoBuilder.build(new Location(0,0),cityModelManager.giveCityAccess.mapSize)
  }
  
  def giveInformations(loc:Location,siz:Size): RetrievedInformationInterface = {
    return infoBuilder.build(loc,siz)
  }
  
  def constructInfrastructureAt(structType: StructureType, location : Location){
    cityModelManager.giveCityAccess.constructInfrastructureAt(structType, location)
  }
  
  def giveCityAccess(): CityAccess = {
    return cityModelManager.giveCityAccess();
  }
  def givePlayerAccess(): PlayerAccess = {
    return playerModelManager.givePlayerAccess
  }
  
  def giveRulesAccess() : RulesAccess = {
    return rules.RuleLibrary; 
  }
  
  def giveScannerAccess(): GeneralScannerInterface = {
    return generalScanner;
  }
  
  def getSizeOf(st:StructureType):Size = {
    val l = new Location(-1,-1)
    st match {
      case StructureType.AREA => return new Area(l).getSize
      case StructureType.PLANT => return new Plant(l).getSize
      case StructureType.TRANSPORT => return new TransportWays(l).getSize
      case StructureType.STATION => return new Station(l).getSize
      case _ => return new Size(0,0)
    }
  }
  
  def getActiveEffect : Set[SideEffectInterface] = return effects
  
  def setActiveEffect(fxs: Set[SideEffectInterface]) : Unit = { effects = fxs} 

  def destroyAt(l:Location):Boolean = cityModelManager.giveCityAccess.destroyAt(l:Location)
  
  def pay(sum:Integer):Boolean = {
    playerModelManager.givePlayerAccess.retrieveMoney(sum)
    return playerModelManager.givePlayerAccess.getMoneyAmount <0
  }
  
  def pay(st:StructureType):Boolean = {
    var sum:Int = 0
    val l = new Location(-1,-1)
    st match {
      case StructureType.AREA => sum = new Area(l).price.getValue.toInt
      case StructureType.PLANT => sum = new Plant(l).price.getValue.toInt
      case StructureType.TRANSPORT => sum = new TransportWays(l).price.getValue.toInt
      case StructureType.STATION => sum = new Station(l).price.getValue.toInt
      case _ => sum = 0
    }
    playerModelManager.givePlayerAccess.retrieveMoney(sum)
    return playerModelManager.givePlayerAccess.getMoneyAmount <0
  }
  
  def getPlayerMoneyAmout():Integer = {
    return playerModelManager.givePlayerAccess.getMoneyAmount
  }
  
}