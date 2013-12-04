/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * simula.ui.textview
 * TextViewTest.scala
 * (c) Simula. on 6 nov. 2013 01:30:25
 * By JC
 * Update 6 nov. 2013 01:30:25
 *
 * *******************************************************
 */
package test.scala.simula.ui.textview

import org.scalatest._
import org.scalatest.matchers._
import org.scalacheck._

/**
 * @author JC
 *
 */
class TextViewTest extends FlatSpec with ShouldMatchers with BeforeAndAfterEach {
  import main.scala.simula.ui._

  private var tv: UIInterface = _
  // Set up the temp file needed by the test
  override def beforeEach() {
    import main.scala.simula.ui._
    import main.scala.simula.ui.InterfaceType._
    tv = (new ViewBuilder()).buildView(null, null, null)
  }

  // Close and delete the temp file
  override def afterEach() {
    tv = null
  }

  "A Text View" should "have maximum size different to zero" in {
    assert(tv.maxSize.length != 0 && tv.maxSize.width != 0)
  }

}
