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
package main.scala.simula.adapters

import main.scala.simula.ui._
import main.scala.simula.common._
import main.scala.simula.engine._
/**
 * @author JC
 * ConcreteEngine should be EngineInterface
 */
class UIEngineAdapter(_ui: UIInterface, eng:ConcreteEngine) extends UIEngineAdapterInterface {
  var ui = _ui
  var engine = eng
  
  override def buildView=_ui.buildView
  override def redefineView=_ui.redefineView
  override def updateView (d: RetreivedInformation)=_ui.updateView(d)
  override def recupereActionsUtilisateur(v:AbstractView)=eng.recupereActionsUtilisateur(v)
  override def envoyerDonneesAViewPourAfficher(v:AbstractView)=eng.envoyerDonneesAViewPourAfficher(v)
  override def modifierLeModele(m:AbstractModel)=eng.modifierLeModele(m)
  override def recupererDonneesDuModele(m:AbstractModel)=eng.recupererDonneesDuModele(m)
  override def appliquerLesReglesDuJeu(m:AbstractModel)=eng.appliquerLesReglesDuJeu(m)

}