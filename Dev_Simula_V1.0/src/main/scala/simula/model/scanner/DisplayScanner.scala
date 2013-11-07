/**********************************************************
 * Simula
 * simula.model.scanner
 * mapScanner.scala
 * (c)Simula on 4 nov. 2013 15:34:20
 * By Bubul
 * Update 4 nov. 2013 15:34:20
 *********************************************************/
package main.scala.simula.model.scanner
import main.scala.simula.model._
import main.scala.simula.model.city._
import main.scala.simula.common._

/**
 * @author Bubul
 *
 */

trait DisplayScanner {
  
  var model: ModelInterface
  
  def scanViewableObjcets():Set[Viewable] = {
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