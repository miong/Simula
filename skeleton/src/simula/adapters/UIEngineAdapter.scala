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

import simula.ui.UIInterface
import simula.common.SimulaData

/**
 * @author JC
 *
 */
class UIEngineAdapter(_ui:UIInterface, eng:EngineInterface) extends UIInterface with EngineInterface {
  var ui = _ui
  var engine = eng

}