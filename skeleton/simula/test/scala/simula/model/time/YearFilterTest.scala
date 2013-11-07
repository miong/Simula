/**
 * *******************************************************
 * Simula
 * simula.model.time.test
 * YearFilterTest.scala
 * (c)Simula on 6 nov. 2013 10:18:01
 * By Bubul
 * Update 6 nov. 2013 10:18:01
 * *******************************************************
 */
package test.scala.simula.model.time.test

/**
 * @author Bubul
 *
 */

import org.scalatest._
import org.scalatest.matchers._
import org.scalatest.mock.EasyMockSugar
import org.easymock.EasyMock._
import org.easymock.EasyMock
import main.scala.simula.model.time._

class YearFilterTest extends FlatSpec with EasyMockSugar with ShouldMatchers {

  var clock: Clock = new Clock()
  val mockListener: YearListener = mock[YearListener]
  val mockListener2: YearListener = mock[YearListener]
  var yfilter: YearFilter = new YearFilter()

  "A YearFilter" should "register a MonthListener when requested" in {
    yfilter.register(mockListener)
    yfilter.filters.size should be(1)
    yfilter.filters.contains(mockListener) should be(true)
    yfilter = null
  }

  "It" should "receive the clock's top have until TimeDefinition.n_year tops" in {
    yfilter = new YearFilter()
    clock.register(yfilter)
    clock.start()
    Thread.sleep((TimeDefinition.n_year - 1) * Clock.topTime + 500)
    clock.stop()
    yfilter.cpt should be(TimeDefinition.n_year - 1)
  }

  "It" should "send a Month when reach TimeDefinition.n_year tops and reset it's state" in {
    yfilter = new YearFilter()
    clock = new Clock()
    mockListener.evenOnYear()
    mockListener2.evenOnYear()
    replay(mockListener)
    replay(mockListener2)
    yfilter.register(mockListener)
    yfilter.register(mockListener2)
    clock.register(yfilter)
    clock.start()
    Thread.sleep((TimeDefinition.n_year) * Clock.topTime + 500)
    clock.stop()
    verify(mockListener)
    verify(mockListener2)
    yfilter.cpt should be(0)
  }
}