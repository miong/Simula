/**
 * *******************************************************
 * Simula
 * simula.model.time.test
 * ClockTest.scala
 * (c)Simula on 5 nov. 2013 20:43:10
 * By Bubul
 * Update 5 nov. 2013 20:43:10
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

class ClockTest extends FlatSpec with EasyMockSugar with ShouldMatchers{
  
  val mockFilter:TimeFilter = mock[TimeFilter]
  val mockFilter2:TimeFilter = mock[TimeFilter]
  var clock:Clock = new Clock()
  
  
  "A Clock" should "register a TimeFilter when requested" in {
	clock.register(mockFilter) 
	clock.filters.size should be (1)
	clock.filters.contains(mockFilter) should be (true)
	clock=null
  }
  
  "It" should "send a Top to its filters after a run" in {
    clock = new Clock()
    mockFilter.receiveTop
    mockFilter2.receiveTop
    replay(mockFilter)
    replay(mockFilter2)
    clock.register(mockFilter)
    clock.register(mockFilter2)
    clock.start()
    Thread.sleep(3500)
    clock.stop()
    verify(mockFilter)
    verify(mockFilter2)
    clock=null
  }
  
  "It" should "send a Top each Clock.topTime to its filters after a run" in {
    clock = new Clock()
    EasyMock.reset(mockFilter)
    EasyMock.reset(mockFilter2)
    EasyMock.expect(mockFilter.receiveTop).times(3)
    EasyMock.expect(mockFilter2.receiveTop).times(3)
    replay(mockFilter)
    replay(mockFilter2)
    clock.register(mockFilter)
    clock.register(mockFilter2)
    clock.start()
    Thread.sleep(3*Clock.topTime+500)
    clock.stop()
    verify(mockFilter)
    verify(mockFilter2)
  }
  
}