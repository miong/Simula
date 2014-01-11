/**
 * *******************************************************
 * simula-project
 * main.scala.simula.ui.guiview
 * GUIDisplay.scala
 * (c)simula-project on 18 nov. 2013 10:36:45
 * By Scarpe
 * Update 18 nov. 2013 10:36:45
 * *******************************************************
 */
package main.scala.simula.ui.guiview

import main.scala.simula.common._
import main.scala.simula.ui._
import javax.swing._
import javax.swing.JFrame._
import java.awt._
import javax.swing.WindowConstants._
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import Array._

/**
 * @author Scarpe
 *
 */
trait GUIDisplay extends DisplayInterface with ActionListener{
  
  var win:JFrame = _
  val commandPanel:JPanel = new JPanel();
  val mapPanel:JPanel = new JPanel();
  mapPanel.setPreferredSize(new Dimension (500,30))
  mapPanel.setMaximumSize(new Dimension (500,30))
  mapPanel.setMinimumSize(new Dimension (500,30))
  val printPanel:JPanel = new JPanel();
  val areaB = new JButton(new ImageIcon("./images/cArea.png"));
  areaB.addActionListener(this);
  val destroy = new JButton(new ImageIcon("./images/destroy.png"));
  destroy.addActionListener(this);
  
  def constructWindow(){
	  win = new JFrame("SIMULA - SIMcity UnofficiaL Apps");
	  val layout = new BorderLayout();
	  win.setLayout(layout);
	  win.setPreferredSize(new Dimension(1200,550))
	  win.add(printPanel,BorderLayout.LINE_START)
	  win.add(commandPanel,BorderLayout.CENTER)
	  win.add(mapPanel,BorderLayout.LINE_END)
	  win.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	  win.addWindowListener(new WindowAdapter() {
	    override def windowClosing(e:WindowEvent):Unit = {
	      outroDisplay();
	      val timer = new Timer(3000,new ActionListener(){
	        override def actionPerformed(arg:ActionEvent):Unit = {
	          System.exit(0);
	        }
	      }).start();
		}
  
	  })
	  
	  commandPanel.setLayout(new FlowLayout())
	  commandPanel.add(areaB);
	  commandPanel.add(destroy);
	  commandPanel.repaint();
	  
	  win.pack();
	  win.setVisible(true);
  }
  
  
  def updateDisplay(d: RetrievedInformationInterface, actualState: RetrievedInformationInterface) {
    
    var viewables: Set[Viewable] = d.getViewables();
    var map: Viewable = viewables.find({ v: Viewable => v != null && v.priority == 0 }).get
    var mapSize: Size = map.getSize

    var tab = ofDim[Viewable](mapSize.length, mapSize.width)
    for (i <- 0 until mapSize.length; j <- 0 until mapSize.width)
      tab(i)(j) = null

    viewables.foreach(v => {
      if (tab(v.getLocation.x)(v.getLocation.y) == null || tab(v.getLocation.x)(v.getLocation.y).priority < v.priority) {
        //tab( v.getLocation.x )( v.getLocation.y )=v;
        for (a <- 0 until v.getSize.length; b <- 0 until v.getSize.width) {
          if(tab(v.getLocation.x + a)(v.getLocation.y + b)==null || tab(v.getLocation.x + a)(v.getLocation.y + b).priority < v.priority)
        	  tab(v.getLocation.x + a)(v.getLocation.y + b) = v
        }
      }
    })
    mapPanel.removeAll();
    mapPanel.setLayout(new BorderLayout())
    mapPanel.add(new JLabel("Tresorerie : "
      + d.getAmountOfMoney().toString()
      + " | Nombre d'habitants : "
      + d.getNumberOfCitizen().toString()
      + " | Taux de criminalite : "
      + d.getGlobalCriminality().toString()
      + " | Taux de pollution : "
      + d.getGlobalPolution().toString()
      + " "),BorderLayout.NORTH);
    val mapView = new JPanel();
    val mapLayout = new GridLayout(mapSize.length,mapSize.width);
    mapView.setLayout(mapLayout);
    for(a <- 0 until mapSize.length ; b <- 0 until mapSize.width){
      val v = viewableToLabel(tab(a)(b),a,b)
      v.setBorderPainted(false);
      v.setContentAreaFilled(false)
      v.addActionListener(this)
      mapView.add(v)
    }
    mapView.setPreferredSize(new Dimension (60,60))
    mapView.setMaximumSize(new Dimension (60,60))
    mapView.setMinimumSize(new Dimension (60,60))
    mapPanel.add(mapView,BorderLayout.CENTER)
    win.pack()
    win.repaint()
  }
  
  def viewableToLabel(v:Viewable,a:Integer,b:Integer):JButton = {
    var image:ImageIcon = null ;
    if (v != null) {
      var str: String = v.view
      (str.split(" "))(0) match {

        case "Network" =>
          image = new ImageIcon("./images/unknown.png")
        case "ElectricGrid" =>
          image = new ImageIcon("./images/unknown.png")
        case "TransportWays" =>
          image = new ImageIcon("./images/unknown.png")
        case "Plant" =>
          image = new ImageIcon("./images/unknown.png")
        case "Station" =>
          image = new ImageIcon("./images/unknown.png")
        case "TransportCenter" =>
          image = new ImageIcon("./images/unknown.png")
        case "Area" =>
          image = new ImageIcon("./images/area.png")
        case "EARTH" =>
          image = new ImageIcon("./images/earth.png")
        case "WATER" =>
          image = new ImageIcon("./images/water.png")
        case "TREE" =>
          image = new ImageIcon("./images/tree.png")
        case "STONE" =>
          image = new ImageIcon("./images/stone.png")
        case "GRASS" =>
          image = new ImageIcon("./images/grass.png")
        case "Map" =>
          image = new ImageIcon("./images/unknown.png")
        case _ =>
          image = new ImageIcon("./images/unknown.png")
      }
    }else{
    	image = new ImageIcon("./images/unknown.png")
    }
    return new Button(image,a,b)
  }
  
  def printSyntaxe():Unit = {}
  
  def printError(err:String):Unit = {
    val msg = new JTextArea(err)
    msg.setEditable(false)
    printPanel.removeAll()
    printPanel.add(msg)
  }
  
  def introDisplay():Unit = {
    val introWin:JWindow = new JWindow();
	introWin.setPreferredSize(new Dimension(250, 300));
	//introWin.setLocation(200, 200)
	val layout = new FlowLayout()
	introWin.setLayout(layout)
	introWin.setVisible(true);
	introWin.pack();
    val msg = "\n\n\n\t**********************************************************\t\t\n" +
    "\t**********************************************************\n" +
    "\n\t\tMikey's production present\n\n" +
    "\t\tSimula - SIMcity UnofficiaL Apps\n\n" +
    "\t\tA Gianas required project\n\n" +
    "\t**********************************************************\n" +
    "\t**********************************************************\n\n\n";
    val in1:JTextArea = new JTextArea(msg)
    in1.setEditable(false)
    introWin.add(in1)
    introWin.pack()
	Thread.sleep(2000);
	//introWin.remove(in1)
	
	val prog = new JProgressBar();
	val progL = new JLabel("Loading:\n");
	prog.setValue(0);
	introWin.add(progL);
	introWin.add(prog);
	introWin.repaint();
	var i = 1
    while (i <= 100) {
      Thread.sleep(100)
      if (i % 10 == 0) {
        prog.setValue(prog.getValue() + 10);
        introWin.repaint();
        introWin.pack();
      }
      i += 1
    }
	progL.setText("DONE");
	introWin.remove(prog);
	introWin.remove(in1);
	introWin.pack();
	val mickey = new ImageIcon("./images/mickey.png");
	val in2 = new JLabel(mickey);
	introWin.add(in2);
	introWin.pack();
	Thread.sleep(3000);
	introWin.dispose();
	constructWindow();
	printError("Bienvenue dans SIMULA.\n Construiser votre ville comme bon vous semble...")
  }
  introDisplay

  
  def outroDisplay():Unit = {
		  val msg = "Special thanks to :\n\n"+
				  "Carpentier Sylvain :                       Game developper\n"+
	    		  "Mbiada Jacques Charles :           Game developper\n"+
	    		  "Mion Giovanni :                            Game developper\n"+
	    		  "Pancarte Kenny :                           Game developper\n\n"+
	    		  "Gianas Yann Regis :                        HeadMaster of Mikey's production Inc.\n"+
	    		  "Zacchiroli Stefano :                       Head of Architecture And Design Department\n"+
	    		  "Varacca Daniele :                          Head of Test and Support Department\n\n";
	      val outL = new JTextArea(msg);
	      val outP = new JPanel();
	      outP.add(outL)
	      win.setContentPane(outP);
	      win.setVisible(true);
	      win.pack()
	      win.repaint()
	      try{
	    
	      } catch {
	        case e:Exception => ;
	      }
  }
  
  def actionPerformed(arg:ActionEvent):Unit;
  
  
}