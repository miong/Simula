/**
 * *******************************************************
 * Simula_Dev1.0
 * main.scala.simula.ui.guiview
 * Butto.scala
 * (c)Simula_Dev1.0 on 11 janv. 2014 14:25:09
 * By Bubul
 * Update 11 janv. 2014 14:25:09
 * *******************************************************
 */
package main.scala.simula.ui.guiview

import javax.swing.ImageIcon
import javax.swing.JButton

/**
 * @author Bubul
 *
 */
class Button(val img: ImageIcon,val posx:Integer,val posy:Integer) extends JButton {
	super.setIcon(img)
    def getPosX(): Integer = posx
    def getPosY(): Integer = posy
}