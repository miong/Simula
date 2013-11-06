/**********************************************************
 *                        Simula                          *
 **********************************************************
 * simula.adapters
 * UIEngineAdapter.scala
 * (c) Simula. on 3 nov. 2013 02:57:52
 * By JC
 * Update 3 nov. 2013 02:57:52
 *
 ********************************************************/
package main.scala.simula.adapters

import main.scala.simula.ui._
import main.scala.simula.common._
import main.scala.simula.engine._
/**
 * @author JC
 * ConcreteEngine should be EngineInterface
 */
class UIEngineAdapter(_ui: UIInterface, eng:ConcreteEngine) extends UIEngineAdapterInterface {
  var ui = _ui
  var engine = eng
  
  override def redefineView=_ui.redefineView
  override def updateView (d: RetrievedInformation)=_ui.updateView(d)
  override def getDataFromModel():RetrievedInformationInterface=eng.getDataFromModel()
  override def sendDataToView(data:RetrievedInformationInterface):Boolean=eng.sendDataToView(data)
  override def getFromModelToView():Boolean=eng.getFromModelToModel
  override def treatDataFromModel(data:RetrievedInformationInterface):RetrievedInformationInterface=eng.treatDataFromModel(data)
  override def sendDataToModel(data:RetrievedInformationInterface):Boolean=eng.sendDataToModel(data)
  override def getFromModelToModel():Boolean=eng.getFromModelToModel

}