/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.model.city
 * InfrastructureBuilder.scala
 * (c)Simula_Dev1.0 on 18 nov. 2013 11:08:18
 * By Bubul
 * Update 18 nov. 2013 11:08:18
 * *******************************************************
 */
package main.scala.simula.model.city

import main.scala.simula.model.city.EnumType._
import main.scala.simula.common.Location

/**
 * @author Bubul
 *
 */
class InfrastructureBuilder {

  def build(t:EnumType,l:Location):Infrastructure = {
	t match {
	  case EnumType.AREA => return new Area(l)
	  case _ => return new Area(l); 
	}
  }
  
}