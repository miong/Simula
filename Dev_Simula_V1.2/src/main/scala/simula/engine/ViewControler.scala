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
package main.scala.simula.engine
import main.scala.simula.common._
class ViewControler {
  def sendDataToView(data: RetrievedInformationInterface, view: AbstractView): Boolean = {
    return view.ack(data)
  }
}