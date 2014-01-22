/**
 * *******************************************************
 * Simula_Dev1.0
 *
 * SimulaLauncher.scala
 * (c)Simula_Dev1.0 on 7 nov. 2013 15:04:47
 * By Bubul
 * Update 7 nov. 2013 15:04:47
 * *******************************************************
 */
/**
 * @author Bubul
 *
 */
package main.scala.simula

import main.scala.simula.common._
import main.scala.simula.engine._
import main.scala.simula.model._
import main.scala.simula.ui._
import main.scala.simula.adapters._
import main.scala.simula.time._
import main.scala.simula.ui.InterfaceType._
import java.util.Scanner

object SimulaLauncher {

  def main(args: Array[String]) {

	val reader : Scanner = new Scanner(System.in)
    val viewBuilder: ViewBuilderInterface = new ViewBuilder()
    val engineBuilder: EngineBuilderInterface = new EngineBuilder()
    val modelBuilder: ModelBuilderInterface = new ModelBuilder()
    
    val uiEngineAdapter: UIEngineAdapterInterface = new UIEngineAdapter()
    val modelEngineAdapter: ModelEngineAdapterInterface = new ModelEngineAdapter()

    val mod: ModelInterface = modelBuilder.ModelBuilder()
    println("Quel type d'interface de jeu voulez vous ?")
    println("1 - graphique (SWING)")
    println("2 - Text (Console) ")
    var interfaceType : InterfaceType = GUI
    var rep = 0;
    try {
    	rep = reader.nextInt()
    }catch {
      case _ : Throwable =>
    	println("Invalide value... \n Defaulte choice : Swing" )
    	rep = 1
    }
    rep match {
	  case 1 => interfaceType = GUI
	  case 2 => interfaceType = TEXT
	  case _ => println("Invalide value... \n Defaulte choice : Swing" )
	}
    val ui: UIInterface = viewBuilder.buildView(interfaceType, uiEngineAdapter, mod.giveInformations())
    val eng: EngineInterface = engineBuilder.build(modelEngineAdapter, uiEngineAdapter)

    uiEngineAdapter.INIT(ui, eng)
    modelEngineAdapter.INIT(mod, eng)
    
    val timeManager: TimeManager = new TimeManager()
    timeManager.buildTimeManager()
    
    
    eng.loadRules
    timeManager.startTime();
    timeManager.registerMonthListener(eng)
    ui.updateView(mod.giveInformations)
  }

}