/**
 * *******************************************************
 * Simula
 * Engine
 * Engine.scala
 * (c) Simula. on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * *******************************************************
 */
package main.scala.simula.engine

import main.scala.simula.common._
import main.scala.simula.common.StructureType._
import main.scala.simula.common.ActionType._


class Engine(_model: AbstractModel, _view: AbstractView) extends EngineInterface with MonthListener{

  var modelControler: ModelControler = new ModelControler()
  var viewControler: ViewControler = new ViewControler()
  var gameControler: GameControler = new GameControler()
  var model: AbstractModel = _model
  var view: AbstractView = _view
  var persisri: RetrievedInformationInterface = _

  def newAction(a: ActionInterface): Unit = {
    a.actionType match {
      case CONSTRUCT => construct(a.what,a.where)
      case DESTROY =>  destroy(a.where)
      case QUIT => exit()
      case _ => {
        view.printSyntaxe()
      }
    }
  }
  
  def isAStructure(v:Viewable):Boolean = return v.priority >= 2
  
  def construct(st:StructureType,where:Location):Unit = {
    if(model.getData(where,model.getSizeOf(st)).getViewables.exists(v => isAStructure(v))){
      view.printError("Vous ne pouvez pas construire a cet emplacement")
    }else{
    	if(model.getPlayerMoneyAmout<0)
    	  view.printError("Vous n'avez pas assez d'argent pour construire ce batiment (vous avez deja des dette)")
    	else{
    		model.constructInfrastructureAt(st,where)
    		val Debt = model.pay(st)
    		if (Debt)
    		  view.printError("Attention vous avez des dette")
    	}
    }
  }
  
  def destroy(where:Location):Unit = {
    model.destroyAt(where)
    val Debt = model.pay(10)
    if (Debt)
    	view.printError("Attention vous avez des dette")
  }
  
  def permiteOperations(): List[Pair[String, Unit => Unit]] = {
    null
  }

  def getInformationsFromModel(): RetrievedInformationInterface = {
    return modelControler.getInformationsFromModel(model)
  }
  
  def getDataFromModel():MapScreenShotInterface = {
    return modelControler.getDataFromModel(model)
  }

  def sendDataToView(data: RetrievedInformationInterface): Boolean = {
    return viewControler.sendDataToView(data, view)
  }

  def getFromModelToView(): Boolean = {
    return sendDataToView(getInformationsFromModel())
  }

  def treatDataFromModel(data:MapScreenShotInterface): Unit = {
    gameControler.treatDataFromModel(data)
  }

  def sendDataToModel(data: RetrievedInformationInterface): Boolean = {
    return modelControler.sendDataToModel(data, model)
  }

  def evenOnMonth(): Unit = {
    var mss:MapScreenShotInterface = getDataFromModel();
    var ri:RetrievedInformationInterface = getInformationsFromModel();
    sendDataToView(ri)
    treatDataFromModel(mss)
  }
  
  def loadRules():Unit = {
    gameControler.setModel(model)
    gameControler.loadRulesFromModel
  }
  
}