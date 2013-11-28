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
import main.scala.simula.ui._
import java.util.Scanner

/**
 * @author Scarpe
 *
 */
trait TUIUserListener extends UserListenerInterface {
	
	var engine:AbstractEngine
	val sc:Scanner = new Scanner(System.in)
	var cmd:String = ""
  
	def startListening():Unit = {
		val t:Thread = new Thread(new Runnable(){
		  def run() = {
			  while(cmd!="QUIT"){
				  cmd = sc.nextLine();
				  //PARSER ET CREE UNE ACTION
				  // ENVOYER ACTION A ENGINE (APL DE METHODE)
				  //engine.newAction(action)
				  if(cmd == "QUIT"){
				    println("SEE YOU DUDE")
				    exit()
				  }
				  println(cmd);
			  }
		  }
		})
		t.start
	}
}