/**********************************************************
 *                        Simula                          *
 **********************************************************
 * simula.adapters
 * ModelEngineAdapter.scala
 * (c) Simula. on 3 nov. 2013 03:18:59
 * By JC
 * Update 3 nov. 2013 03:18:59
 *
 *********************************************************/
package simula.adapters
import simula.model._
import simula.model.city._
import simula.model.player._
import simula.model.time._
import simula.engine._

/**
 * @author JC
 *
 */
class ModelEngineAdapter(mod:ModelManager, eng:ConcreteEngine)  extends ModelEngineAdapterInterface{
  var model = mod
  var engine = eng
  
  	override def giveCityAccess():CityAccess=mod.giveCityAccess;
	override def givePlayerAccess():PlayerAccess=mod.givePlayerAccess;
	override def giveTimeAccess():TimeAccess=mod.giveTimeAccess;
	override def recupereActionsUtilisateur(v:AbstractView)=eng.recupereActionsUtilisateur(v)
	override def envoyerDonneesAViewPourAfficher(v:AbstractView)=eng.envoyerDonneesAViewPourAfficher(v)
	override def modifierLeModele(m:AbstractModel)=eng.modifierLeModele(m)
	override def recupererDonneesDuModele(m:AbstractModel)=eng.recupererDonneesDuModele(m)
	override def appliquerLesReglesDuJeu(m:AbstractModel)=eng.appliquerLesReglesDuJeu(m)
  
}