/**
 * *******************************************************
 * Simula
 * Engine
 * ConcreteEngine.scala
 * (c)SimulaGame on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * *******************************************************
 */
package main.scala.simula.engine

import main.scala.simula.common._

class ConcreteEngine (_model:AbstractModel, _view:AbstractView) extends EngineInterface {
	
	var modelControler:	ModelControler	= _
	var viewControler:	ViewControler	= _
	var gameControler:	GameControler	= _
	var model: 			AbstractModel	= _model
	var view:			AbstractView	= _view
	
	def getDataFromModel(): RetrievedInformationInterface = {
	  return modelControler.getDataFromModel(model)
	}
	
	def sendDataToView(data: RetrievedInformationInterface): Boolean = {
	  return viewControler.sendDataToView(data,view)
	}
	
	def getFromModelToView(): Boolean = {
	  return sendDataToView(getDataFromModel())
	}
	
	def treatDataFromModel(data: RetrievedInformationInterface):RetrievedInformationInterface={
	  return gameControler.treatDataFromModel(data)
	} 
	
	def sendDataToModel(data:RetrievedInformationInterface):Boolean={
	  return modelControler.sendDataToModel(data,model)
	}
	
	def getFromModelToModel():Boolean={
	  return sendDataToModel(treatDataFromModel(getDataFromModel()))
	}
	
}