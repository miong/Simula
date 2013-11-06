/**
 * *******************************************************
 * SimulaGame
 * Engine
 * Engine.scala
 * (c)SimulaGame on 30 oct. 2013 11:30:30
 * By ken
 * Update 30 oct. 2013 11:30:30
 * 
 * Ce trait permet de definir l'interface d'un engine
 * Peut etre etendu par un adpater par exemple
 *********************************************************/
package simula.engine

trait EngineInterface{
  // Ces methodes sont implemente dans l'engine et accessible de l'exterieur
	def recupereActionsUtilisateur(v:AbstractView)
	def envoyerDonneesAViewPourAfficher(v:AbstractView)
	def modifierLeModele(m:AbstractModel)
	def recupererDonneesDuModele(m:AbstractModel)
	def appliquerLesReglesDuJeu(m:AbstractModel)
}