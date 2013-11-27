/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.model
 * MapScreenShotBuilder.scala
 * (c)Simula_Dev1.0 on 27 nov. 2013 09:46:30
 * By Bubul
 * Update 27 nov. 2013 09:46:30
 * *******************************************************
 */
package main.scala.simula.model

import main.scala.simula.common._

/**
 * @author Bubul
 *
 */
class MapScreenShotBuilder(model:ModelInterface) {
  
  def build():MapScreenShotInterface = {
    val mapSize = model.giveCityAccess.mapSize
    var res = new MapScreenShot(mapSize)
    for(i <- 0 until mapSize.length; j <- 0 until mapSize.width)
        res.mss(i)(j) = model.giveInformations(new Location(i,j), new Size(1,1));
    return res
  }
  
}