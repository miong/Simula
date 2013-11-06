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
package simula.model
import simula.model.player._

class PlayerModelManager {
	// default value added !! need to construct The Builder !!!
	var playerAccess:PlayerAccess=null
	
	def InitWith(pbi:PlayerBuilderInterface){
	  //playerAccess=pbi.PlayerBuilder();
	}
	
	def givePlayeurAccess():PlayerAccess={
		return playerAccess 
	}
}