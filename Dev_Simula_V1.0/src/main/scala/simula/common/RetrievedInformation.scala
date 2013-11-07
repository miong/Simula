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
class RetrievedInformation(val numberOfCitizen:Integer,val globalPolution:Integer,val globalCriminality:Integer) extends RetrievedInformationInterface {
	
  var viewables: Viewable = _
  
  def getViewables = viewables
  def getNumberOfCitizen():Integer = {
    return numberOfCitizen
  }
	
	def getGlobalPolution():Integer = {
	  return globalPolution
	}
	
	def getGlobalCriminality:Integer = {
	  return globalCriminality
	}

}