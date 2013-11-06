/**********************************************************
 * Simula
 * simula.model.scanner
 * mapScanner.scala
 * (c)Simula on 4 nov. 2013 15:34:20
 * By Bubul
 * Update 4 nov. 2013 15:34:20
 *********************************************************/
package simula.model.scanner
import simula.model._
import simula.model.city._
import simula.common._

/**
 * @author Bubul
 *
 */

trait DisplayScanner {
  
  var model:ModelInterface
  
  def ScanViewableObjcets():Set[Viewable] = {
     var rval = Set[Viewable]()
     val map:Array[Array[Box]] = model.giveCityAccess.getMapAccess.tab
     rval += model.giveCityAccess.getMapAccess
     for(ab:Array[Box] <- map;b:Box <- ab){
       rval += b
       for(i:Infrastructure <- b.infrastructures){
    	   rval += i
       }
     }
     return rval
  }

}