/**
 * *******************************************************
 * simula-project
 * main.scala.simula.ui.tuiview
 * TextUserListener.scala
 * (c)simula-project on 18 nov. 2013 10:21:39
 * By Scarpe
 * Update 18 nov. 2013 10:21:39
 * *******************************************************
 */
package main.scala.simula.ui.tuiview

import main.scala.simula.common._
import main.scala.simula.common.ActionType._
import main.scala.simula.common.StructureType._
import main.scala.simula.ui._
import java.util.Scanner

/**
 * @author Scarpe
 *
 */
trait TUIUserListener extends UserListenerInterface{
	
	var actBuilder:ActionBuilder = new ActionBuilder()
	var engine:AbstractEngine
	val sc:Scanner = new Scanner(System.in)
	var cmd:String = ""
  
	def startListening():Unit = {
		val t:Thread = new Thread(new Runnable(){
		  def run() = {
			  while(cmd!="QUIT") {
				  cmd = sc.nextLine();
				  engine.newAction(parse(cmd.toUpperCase()))
				  if(cmd == "QUIT"){
				    println("SEE YOU DUDE")
				  }
			  }
		  }
		})
		t.start
	}
	
	// action where what
	def parse(str:String):ActionInterface={
	  val array = str.split(" ")
	  try{
		  var where: Location = new Location(0,0)
		  var what: StructureType = NOTHING
		  var actionType: ActionType = NOA
		  ActionType.maxId
		  array(0) match {
		  case "QUIT" => actionType = QUIT
		  case "CONSTRUCT" => actionType = CONSTRUCT
		  case "DESTROY" => actionType = DESTROY
		  case _ => actionType = NOA
		  }
		  if(array.length > 1){
			  val loc = array(1).split(",");
			  where = new Location(loc(0).toInt,loc(1).toInt)
		  }	
	    
		  if(array.length > 2){
			  array(2) match {
			  case "AREA" => what = AREA
			  case _ => what = NOTHING
			  }
			  return actBuilder.build(actionType,what,where)
		  }
		  
		  return actBuilder.build(actionType, where)
		  
	  }catch {
	    case _:Throwable => {
	      return actBuilder.build(NOA,new Location(-1,-1))
	    }
	  }
	}
}