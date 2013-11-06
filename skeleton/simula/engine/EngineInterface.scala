/**
 * *******************************************************
 * SimulaGame
 * Engine
 * ll.scala
 * (c)SimulaGame on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * *******************************************************
 */
package simula.engine
import simula.common._

abstract class AbstractEngine extends EngineInterface{
	var modelControler: ModelControler=null
	var viewControler: ViewControler=null
	var model:AbstractModel=null
	var view:AbstractView=null
	var gameControler:GameControler=null
	
}

trait EngineInterface{
	def getDataFromModel():RetrievedInformationInterface
	def sendDataToView(data:RetrievedInformationInterface):Boolean
	def getFromModelToView():Boolean
	def treatDataFromModel(data:RetrievedInformationInterface):RetrievedInformationInterface
	def sendDataToModel(data:RetrievedInformationInterface):Boolean
	def getFromModelToModel():Boolean
	
}