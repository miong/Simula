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

abstract class AbstractEngine {
	var model: AbstractModel=null
	var view: AbstractView=null
	def recupereActionsUtilisateur(v:AbstractView)
	def envoyerDonneesAViewPourAfficher(v:AbstractView)
	def modifierLeModele(m:AbstractModel)
	def recupererDonneesDuModele(m:AbstractModel)
	def appliquerLesReglesDuJeu(m:AbstractModel)	
}