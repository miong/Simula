/**
 * *******************************************************
 * SimulaGameV2
 * engine.test
 * TestEngine.scala
 * (c)SimulaGameV2 on 5 nov. 2013 23:11:44
 * By ken
 * Update 5 nov. 2013 23:11:44
 * *******************************************************
 */
package simula.engine.test

import simula.engine._
import simula.common._
import org.scalatest._
import org.scalacheck._
//import org.scalatest.matchers._
/**
 * @author ken
 *
 */

class ConcreteModel extends AbstractModel {
	def getData():RetrievedInformationInterface ={
	  return new RetrievedInformation(10,10,10)
	}
	def ack(data:RetrievedInformationInterface):Boolean={
	  return true;
	}
}

class ConcreteView extends AbstractView{
	def ack(data:RetrievedInformationInterface):Boolean={
	  return true;
	}
}

class TestEngine extends FlatSpec with ShouldMatchers {
  
	var model: ConcreteModel  {
	  
	}
	
	var view:AbstractView {
	  
	}
	
	var data :RetrievedInformationInterface = new RetrievedInformation(10,10,10)
	
	var engineBuilder: EngineBuilderInterface = new EngineBuilder()
	var engine:EngineInterface= engineBuilder.build( model,view)
	
	
	"An Engine" should "retrieve data from Model" in {
    	engine.getDataFromModel() should be (data) 
    	
    }
	
	"An Engine" should "send data to view" in {
    	engine.sendDataToView(data) should be (true) 
    	
    }
	
	"An Engine" should "retrieve data from Model then send data to view" in {
    	engine.getFromModelToView() should be (true) 
    	
    }
	
	"An Engine" should "treat data coming from the Model" in {
    	engine.treatDataFromModel(data) should be (data) 
    	
    }
	
	"An Engine" should "send data to Model" in {
    	engine.sendDataToModel(data) should be (true) 
    	
    }
	
	"An Engine" should "get data from Model then treat it then send it to Model" in {
    	engine.getFromModelToModel() should be (true) 
    	
    }
	
	
	
}