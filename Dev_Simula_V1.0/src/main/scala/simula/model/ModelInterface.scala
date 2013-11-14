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
import main.scala.simula.common.RetrievedInformationInterface

trait ModelInterface {

  def giveCityAccess(): CityAccess;
  def givePlayerAccess(): PlayerAccess;
  def giveInformations(): RetrievedInformationInterface;

}
