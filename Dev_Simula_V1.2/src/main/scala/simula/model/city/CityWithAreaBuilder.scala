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

package main.scala.simula.model.city

import main.scala.simula.common._
import main.scala.simula.common.StructureType._

class CityWithAreaBuilder extends CityBuilderInterface {
  def buildCity(): CityAccess = {
    var c: CityAccess = new City(new Size(20, 40));
    //c.constructAnArea(new Location(0, 0));
    c.constructInfrastructureAt(AREA, new Location(0,0))
    return c;
  }
}

