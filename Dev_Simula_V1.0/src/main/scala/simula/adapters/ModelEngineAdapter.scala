/**********************************************************
 *                        Simula                          *
 **********************************************************
 * simula.adapters
 * ModelEngineAdapter.scala
 * (c) Simula. on 3 nov. 2013 03:18:59
 * By JC
 * Update 3 nov. 2013 03:18:59
 *
 *********************************************************/
package main.scala.simula.adapters

import main.scala.simula.model._
import main.scala.simula.model.city._
import main.scala.simula.model.player._
import main.scala.simula.model.time._
import main.scala.simula.engine._
import main.scala.simula.common._
/**
 * @author JC
 *
 */
class ModelEngineAdapter(mod:ModelManager, eng:ConcreteEngine)  extends ModelEngineAdapterInterface{
  var model = mod
  var engine = eng
  
  	override def giveCityAccess():CityAccess=mod.giveCityAccess;
	override def givePlayerAccess():PlayerAccess=mod.givePlayerAccess;
	override def giveTimeAccess():TimeAccess=mod.giveTimeAccess;
	override def getDataFromModel():RetrievedInformationInterface=eng.getDataFromModel()
	override def sendDataToView(data:RetrievedInformationInterface):Boolean=eng.sendDataToView(data)
	override def getFromModelToView():Boolean=eng.getFromModelToModel
	override def treatDataFromModel(data:RetrievedInformationInterface):RetrievedInformationInterface=eng.treatDataFromModel(data)
	override def sendDataToModel(data:RetrievedInformationInterface):Boolean=eng.sendDataToModel(data)
	override def getFromModelToModel():Boolean=eng.getFromModelToModel
  
}