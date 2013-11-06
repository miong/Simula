/**
 * *******************************************************
 * Simula
 * simula.model.time.test
 * MonthFilterTest.scala
 * (c)Simula on 6 nov. 2013 09:58:40
 * By Bubul
 * Update 6 nov. 2013 09:58:40
 * *******************************************************
 */
package simula.model.time.test

/**
 * @author Bubul
 *
 */

import org.scalatest._
import org.scalatest.matchers._
import org.scalatest.mock.EasyMockSugar
import org.easymock.EasyMock._
import org.easymock.EasyMock
import simula.model.time._

class MonthFilterTest extends FlatSpec with EasyMockSugar with ShouldMatchers{

  var clock:Clock = new Clock()
  val mockListener:MonthListener = mock[MonthListener]
  val mockListener2:MonthListener = mock[MonthListener]
  var mfilter:MonthFilter = new MonthFilter()
  
  "A MonthFilter" should "register a MonthListener when requested" in {
	mfilter.register(mockListener) 
	mfilter.filters.size should be (1)
	mfilter.filters.contains(mockListener) should be (true)
	mfilter=null
  }
  
  "It" should "receive the clock's top have until TimeDefinition.n_month tops" in {
    mfilter=new MonthFilter()
    clock.register(mfilter)
    clock.start()
    Thread.sleep((TimeDefinition.n_month-1)*Clock.topTime+500)
    clock.stop()
    mfilter.cpt should be (TimeDefinition.n_month-1)
  }
  
  "It" should "send a Month when reach TimeDefinition.n_month tops and reset it's state" in {
    mfilter=new MonthFilter()
    clock = new Clock()
    mockListener.evenOnMonth()
    mockListener2.evenOnMonth()
    replay(mockListener)
    replay(mockListener2)
    mfilter.register(mockListener)
    mfilter.register(mockListener2)
    clock.register(mfilter)
    clock.start()
    Thread.sleep((TimeDefinition.n_month)*Clock.topTime+500)
    clock.stop()
    verify(mockListener)
    verify(mockListener2)
    mfilter.cpt should be (0)
  }
  
}