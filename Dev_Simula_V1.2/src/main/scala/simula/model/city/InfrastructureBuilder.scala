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

import main.scala.simula.common._
import main.scala.simula.common.StructureType._

/**
 * @author Bubul
 *
 */
class InfrastructureBuilder {

  def build(t: StructureType, l: Location): Infrastructure = {
    t match {
      case StructureType.AREA => return new Area(l)
      case StructureType.PLANT => return new Plant(l)
      case StructureType.TRANSPORT => return new TransportWays(l)
      case StructureType.STATION => return new Station(l)
      case StructureType.ROAD => return new Road(l)
      case StructureType.POLICECENTER => return new PoliceCenter(l) 
      case StructureType.RESIDENCE => return new Residence(l) 
      case StructureType.POWERPLANT=> return new PowerPlant(l) 
      case StructureType.ELECTRICLINE=> return new ElectricLine(l)
      case _ => return new Area(l);
    }
  }
}