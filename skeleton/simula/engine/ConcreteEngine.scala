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

class ConcreteEngine extends AbstractEngine with EngineInterface {
	def getDataFromModel():RetrievedInformationInterface ={
	  return modelControler.getDataFromModel(model)
	}
	def sendDataToView(data:RetrievedInformationInterface):Boolean={
	  return viewControler.sendDataToView(data,view)
	}
	def getFromModelToView():Boolean={
	  return sendDataToView(getDataFromModel())
	}
	def treatDataFromModel(data:RetrievedInformationInterface):RetrievedInformationInterface={
	  return gameControler.treatDataFromModel(data)
	} 
	def sendDataToModel(data:RetrievedInformationInterface):Boolean={
	  return modelControler.sendDataToModel(data,model)
	}
	def getFromModelToModel():Boolean={
	  return sendDataToModel(treatDataFromModel(getDataFromModel()))
	}
}