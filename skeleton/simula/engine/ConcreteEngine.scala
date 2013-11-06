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

class ConcreteEngine(_ui: AbstractView, _mod: AbstractModel) extends EngineInterface {
	var viewControler: ViewControler	= null 
	var gameControler: GameControler	= null
	var modelControler:ModelControler	= null

	var model: AbstractModel 			= _mod
	var view:  AbstractView  			= _ui
	
	def recupereActionsUtilisateur(v:AbstractView) = {
		viewControler.recupererActionsUtilisateur(v)
	}
	def envoyerDonneesAViewPourAfficher(v:AbstractView) = {
	  	viewControler.envoyerDonneesAViewPourAfficher(v: AbstractView)
	}

	def modifierLeModele(m: AbstractModel) = {
	  	modelControler.modifierLeModele(m: AbstractModel)
	}
	def recupererDonneesDuModele(m: AbstractModel)={
	  	modelControler.recupererDonneesDuModele(m: AbstractModel)
	}
	def appliquerLesReglesDuJeu(m: AbstractModel) = {
	  	gameControler.appliquerLesReglesDuJeu(m: AbstractModel)
	}
}