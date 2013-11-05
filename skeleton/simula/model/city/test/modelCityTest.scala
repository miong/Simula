/**
 * *******************************************************
 * Simula
 * model.city.test
 * modelCityTest.scala
 * (c)Simula on 2 nov. 2013 17:14:47
 * By Scarpe
 * Update 2 nov. 2013 17:14:47
 * *******************************************************
 */
package simula.model.city.test

/**
 * @author Scarpe
 *
 */
import simula.model.city._;
import org.scalatest._
import org.scalatest.matchers._
//import org.scalacheck._

class modelCityTest extends FlatSpec with ShouldMatchers {
  
	val citybuilder:CityBuilderInterface  = new CityBuilder();
    val city : CityAccess = citybuilder.CityBuilder()
     val m:Map=city.getMapAccess();
    
    "The builder by default method" should "create an array of 10x10 boxes" in {
    	m.tab.length should be (10)
    }
    "The method: constructAnArea in City" should "create an Infrastructure on the map at the given location" in {
    	m.tab(0)(0).infrastructures.isEmpty should be (false)
    	m.tab(0)(1).infrastructures.isEmpty should be (false)
    	m.tab(1)(0).infrastructures.isEmpty should be (false)
    	m.tab(1)(1).infrastructures.isEmpty should be (false)
    	m.tab(0)(2).infrastructures.isEmpty should be (true)
    	m.tab(2)(0).infrastructures.isEmpty should be (true)
    }

}
