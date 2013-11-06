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
package simula.model.city

import simula.common._
class CityBuilder extends CityBuilderInterface{
	def CityBuilder():CityAccess={
	  return new City(new Size(10,10));
	}
}