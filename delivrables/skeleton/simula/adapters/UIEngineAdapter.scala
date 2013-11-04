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
package simula.adapters

import simula.ui.cliview._
import simula.common.SimulaData
import simula.engine._
/**
 * @author JC
 *
 */
class UIEngineAdapter(_ui:CLIView, eng:ConcreteEngine) extends UIEngineAdapterInterface {
  var ui = _ui
  var engine = eng
  
  override def buildView=_ui.buildView
  override def redefineView=_ui.redefineView
  override def updateView (d: SimulaData)=_ui.updateView(d)
  override def recupereActionsUtilisateur(v:AbstractView)=eng.recupereActionsUtilisateur(v)
  override def envoyerDonneesAViewPourAfficher(v:AbstractView)=eng.envoyerDonneesAViewPourAfficher(v)
  override def modifierLeModele(m:AbstractModel)=eng.modifierLeModele(m)
  override def recupererDonneesDuModele(m:AbstractModel)=eng.recupererDonneesDuModele(m)
  override def appliquerLesReglesDuJeu(m:AbstractModel)=eng.appliquerLesReglesDuJeu(m)

}