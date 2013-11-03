/**********************************************************
 *                       Simula                          *
 **********************************************************
 * simula.adapters.tests
 * ModelEngineAdapterTest.scala
 * (c) Simula. on 3 nov. 2013 09:29:26
 * By JC
 * Update 3 nov. 2013 09:29:26
 *
 *********************************************************/
package simula.adapters.tests

import org.scalatest._

/**
 * @author JC
 *
 */
class ModelEngineAdapterTest  extends FlatSpec with BeforeAndAfterEach {

  private var uieng:ModelEngineAdapter = _

     // Set up the temp file needed by the test
   override def beforeEach() {
    uieng	= new ModelEngineAdapter(null, null)
   }

   // Close and delete the temp file
   override def afterEach() {
    uieng   = null

   }

   
   "An Model Engine " should "have a ModelInterface and an EngineInterface" in {
    assert(false)
  }

  it should "Simula Data object" in {
    assert(false)
  }

}