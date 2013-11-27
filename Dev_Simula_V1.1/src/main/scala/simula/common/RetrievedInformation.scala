/**
 * *******************************************************
 * Simula
 * scanner
 * RetreivedInformation.scala
 * (c)Simula on 1 nov. 2013 13:21:16
 * By Bubul
 * Update 1 nov. 2013 13:21:16
 * *******************************************************
 */
package main.scala.simula.common

/**
 * @author Bubul
 *
 */
class RetrievedInformation(var numberOfCitizen: Integer, var globalPolution: Integer, var globalCriminality: Integer, var viewable: Set[Viewable], var loc: Location, val siz: Size) extends RetrievedInformationInterface {

  def getViewables(): Set[Viewable] = {
    return viewable
  }

  def getNumberOfCitizen(): Integer = {
    return numberOfCitizen
  }

  def getGlobalPolution(): Integer = {
    return globalPolution
  }

  def getGlobalCriminality: Integer = {
    return globalCriminality
  }

  def getLocationOfInfos(): Location = {
    return loc
  }
  def getSizeOfInfos(): Size = {
    return siz
  }

  //  def +=(ri:RetrievedInformationInterface){
  //    this.numberOfCitizen = this.numberOfCitizen + ri.getNumberOfCitizen
  //    this.globalPolution = this.globalPolution + ri.getGlobalPolution
  //    this.globalCriminality = this.globalCriminality + ri.getGlobalCriminality
  //  }

}