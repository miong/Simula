/**
 * *******************************************************
 * Simula
 * scanner
 * Test.scala
 * (c)Simula on 30 oct. 2013 11:17:58
 * By Bubul
 * Update 30 oct. 2013 11:17:58
 * *******************************************************
 */
package scanner.test

import scanner._
import org.scalatest._
import org.scalatest.matchers._
import org.scalacheck._

class TestGeneralScanner extends FlatSpec with ShouldMatchers {
  
  "A GeneralScanner" should "retrieve the number of citizens of its model" in {
    var m : Model = new Model{
		def retrieveNumberOfCitizens() : Integer = 0;
    }
    
    var e: scanner.Engine = new scanner.Engine{
      
    }
    var gsbuilder = new GeneralScannerBuilder()
    var gs : GeneralScannerInterface = gsbuilder.ScannerBuilder(m, e)
    gs.ScanNumberOfCitizens should be (0)
    
  }

}