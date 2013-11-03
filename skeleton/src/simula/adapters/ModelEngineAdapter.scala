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

/**
 * @author JC
 *
 */
class ModelEngineAdapter(mod:ModelInterface, eng:EngineInterface)  extends ModelInterface with EngineInterface {
  var model = mod
  var engine = eng
  
}