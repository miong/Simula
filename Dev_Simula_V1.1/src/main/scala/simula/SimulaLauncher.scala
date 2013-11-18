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

object SimulaLauncher {

  def main(args: Array[String]) {

//    println("\n\n\n\t**********************************************************")
//    println("\t**********************************************************")
//    println("\n\t\t\tMikey's production present\n")
//    Thread.sleep(2000)
//    println("\t\t\tSimula - SIMcity UnofficiaL Apps\n")
//    Thread.sleep(1000)
//    println("\t\t\tA Gianas required project\n")
//    Thread.sleep(1000)
//    println("\t**********************************************************")
//    println("\t**********************************************************\n\n\n")
//
//    print("\nLoading:")
//    System.out.flush()
//    var i = 1
//    while (i <= 100) {
//      Thread.sleep(100)
//      if (i % 10 == 0) {
//        print(".")
//        System.out.flush()
//      }
//      i += 1
//    }
//    println("OK\n ----> Game loaded!")
//    Thread.sleep(1500)

    val viewBuilder: ViewBuilderInterface = new ViewBuilder()
    val engineBuilder: EngineBuilderInterface = new EngineBuilder()
    val modelBuilder: ModelBuilderInterface = new ModelBuilder()
    
    val uiEngineAdapter: UIEngineAdapterInterface = new UIEngineAdapter()
    val modelEngineAdapter: ModelEngineAdapterInterface = new ModelEngineAdapter()

    val mod: ModelInterface = modelBuilder.ModelBuilder()
    val ui: UIInterface = viewBuilder.buildView(TEXT, uiEngineAdapter, mod.giveInformations())
    val eng: EngineInterface = engineBuilder.build(modelEngineAdapter, uiEngineAdapter)

    uiEngineAdapter.INIT(ui, eng)
    modelEngineAdapter.INIT(mod, eng)
    
    val timeManager: TimeManager = new TimeManager()
    timeManager.buildTimeManager()
    
    timeManager.startTime();
    timeManager.registerMonthListener(eng)
    ui.updateView(mod.giveInformations)
  }

}