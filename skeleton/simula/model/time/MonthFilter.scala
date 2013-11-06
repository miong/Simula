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
package simula.model.time

class MonthFilter extends MonthFilterInterface{
  
  var month:Integer=TimeDefinition.n_month
  var cpt:Integer=0;
  var filters:List[MonthListener]=Nil;
  
  def receiveTop():Unit = {
     cpt=cpt+1;
     if(cpt==month){
       cpt=0;
       sendMonth();
     }
  }
  
  def register(ml:MonthListener):Unit = {
	  filters= ml::filters;
	}

  def sendMonth():Unit = {
    for(ml <- filters)
    	ml.evenOnMonth();
  }
  
}