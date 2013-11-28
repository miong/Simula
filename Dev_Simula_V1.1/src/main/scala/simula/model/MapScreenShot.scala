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
import main.scala.simula.model.city.Infrastructure
import main.scala.simula.model.city.Infrastructure

/**
 * @author Bubul
 *
 */
class MapScreenShot(val mapSize:Size) extends MapScreenShotInterface{
  
  var mss = ofDim[RetrievedInformationInterface](mapSize.length,mapSize.width);
  var infras : Set[Infrastructure] = Set.empty[Infrastructure]
  
  def getInformationsOfBoxAt(loc:Location):RetrievedInformationInterface = {
    return mss(loc.x)(loc.y)
  }
  
  def getMapSize():Size = {
    return mapSize
  }
  
  def getInfrastructures():Set[Infrastructure] = {
    return infras
  }

}