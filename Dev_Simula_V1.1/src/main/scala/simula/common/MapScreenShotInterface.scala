/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.common
 * MapScreenShot.scala
 * (c)Simula_Dev1.0 on 27 nov. 2013 09:43:23
 * By Bubul
 * Update 27 nov. 2013 09:43:23
 * *******************************************************
 */
package main.scala.simula.common

import main.scala.simula.model.city.Infrastructure

/**
 * @author Bubul
 *
 */
trait MapScreenShotInterface {
	
	def getInformationsOfBoxAt(loc:Location):RetrievedInformationInterface
	def getMapSize():Size
	def getInfrastructures():Set[Infrastructure]
}