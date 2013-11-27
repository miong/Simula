/**
 * *******************************************************
 * Simula
 *
 * test2.scala
 * (c)Simula on 30 oct. 2013 11:19:05
 * By Scarpe
 * Update 30 oct. 2013 11:19:05
 * *******************************************************
 */
/**
 * @author Scarpe
 *
 */

package main.scala.simula.time {

  class Clock extends Thread with ClockInterface {
    var filters: List[TimeFilter] = Nil;

    def register(tf: TimeFilter): Unit = {
      filters = tf :: filters;
    }

    def sendTop(): Unit = {
      for (tf: TimeFilter <- filters)
        tf.receiveTop;
    }

    override def run(): Unit = {
      while (true) {
        Thread.sleep(Clock.topTime);
        sendTop();
        //println("Clock sent")
      }
    }

  }

  object Clock {
    val topTime = 3000
  }

}