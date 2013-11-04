/**********************************************************
 *                        Simula                          *
 **********************************************************
 * simula.adapters.tests
 * UIEngineAdapterTest.scala
 * (c) Simula. on 3 nov. 2013 09:13:36
 * By JC
 * Update 3 nov. 2013 09:13:36
 *
 *********************************************************/
package simula.adapters.tests

import org.scalatest._
import simula.adapters._

/**
 * @author JC
 *
 */

class UIEngineAdapterTest extends FlatSpec with BeforeAndAfterEach {

  private var modeng:ModelEngineAdapter = _

     // Set up the temp file needed by the test
   override def beforeEach() {
    modeng	= new ModelEngineAdapter(null, null)
   }

   // Close and delete the temp file
   override def afterEach() {
    modeng   = null

   }

   
   "An UI Engine " should "have a UIInterface and an EngineInterface" in {
    assert(false)
  }

  it should "Simula Data object" in {
    assert(false)
  }

}