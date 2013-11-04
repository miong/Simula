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
import org.scalacheck._

class modelCityTest extends FlatSpec with ShouldMatchers {
  
	val citybuilder:CityBuilderInterface  = new CityBuilder();
    val city : CityAccess = citybuilder.CityBuilder()
    
    "A city" should "have a map of given size" in {
    	
    }

}
