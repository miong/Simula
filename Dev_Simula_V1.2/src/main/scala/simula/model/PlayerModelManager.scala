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
import main.scala.simula.model.player._

class PlayerModelManager {

  val pBuilder = new PlayerBuilder()
  val initialAmountOfMoney:Integer = 500
  var playerAccess: PlayerAccess = pBuilder.build(initialAmountOfMoney)

  def givePlayerAccess(): PlayerAccess = {
    return playerAccess
  }
}