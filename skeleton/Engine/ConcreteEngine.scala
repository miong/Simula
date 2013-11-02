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
package Engine

class ConcreteEngine extends AbstractEngine {
	var viewControler:ViewControler=null 
	var gameControler:GameControler=null
	var modelControler:ModelControler=null

	
	def recupereActionsUtilisateur(v:AbstractView)={
		viewControler.recupererActionsUtilisateur(v)
	}
	def envoyerDonneesAViewPourAfficher(v:AbstractView)={
	  	viewControler.envoyerDonneesAViewPourAfficher(v:AbstractView)
	}
	def modifierLeModele(m:AbstractModel)={
	  	modelControler.modifierLeModele(m:AbstractModel)
	}
	def recupererDonneesDuModele(m:AbstractModel)={
	  	modelControler.recupererDonneesDuModele(m:AbstractModel)
	}
	def appliquerLesReglesDuJeu(m:AbstractModel)={
	  	gameControler.appliquerLesReglesDuJeu(m:AbstractModel)
	}
}