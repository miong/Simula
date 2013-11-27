/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.model
 * MapScreenShot.scala
 * (c)Simula_Dev1.0 on 27 nov. 2013 09:46:03
 * By Bubul
 * Update 27 nov. 2013 09:46:03
 * *******************************************************
 */
package main.scala.simula.model

import main.scala.simula.common._
import Array._

/**
 * @author Bubul
 *
 */
class MapScreenShot(mapSize:Size) extends MapScreenShotInterface{
  
  var mss = ofDim[RetrievedInformationInterface](mapSize.length,mapSize.width);
  
  def getInformationsOfBoxAt(loc:Location):RetrievedInformationInterface = {
    return mss(loc.x)(loc.y)
  }

}