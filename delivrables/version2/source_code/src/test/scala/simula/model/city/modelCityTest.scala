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
package test.scala.simula.model.city.test

/**
 * @author Scarpe
 *
 */
import main.scala.simula.model.city._;
import org.scalatest._
import org.scalatest.matchers._
import main.scala.simula.common._
//import org.scalacheck._

class modelCityTest extends FlatSpec with ShouldMatchers {

  val citybuilder: CityBuilderInterface = new CityWithAreaBuilder();
  val city: CityAccess = citybuilder.buildCity()

  "The builder by default method" should "create an array of 10x10 boxes" in {
    val s = city.mapSize
    s.width should be(10)
    s.length should be(10)
  }
  "The method: constructAnArea in City" should "create an Infrastructure on the map at the given location" in {
    city.getCellAt(new Location(0,0)).infrastructures.isEmpty should be(false)
    city.getCellAt(new Location(0,1)).infrastructures.isEmpty should be(false)
    city.getCellAt(new Location(0,2)).infrastructures.isEmpty should be(false)
    city.getCellAt(new Location(1,0)).infrastructures.isEmpty should be(false)
    city.getCellAt(new Location(1,1)).infrastructures.isEmpty should be(false)
    city.getCellAt(new Location(1,2)).infrastructures.isEmpty should be(false)
    city.getCellAt(new Location(2,0)).infrastructures.isEmpty should be(false)
    city.getCellAt(new Location(2,1)).infrastructures.isEmpty should be(false)
    city.getCellAt(new Location(2,2)).infrastructures.isEmpty should be(false)
    city.getCellAt(new Location(3,0)).infrastructures.isEmpty should be(true)
    city.getCellAt(new Location(0,3)).infrastructures.isEmpty should be(true)
  }

}
