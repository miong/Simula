/**
 * ********************************************************
 *               Simula                          *
 * *********************************************************
 * main.scala.simula.common
 * Persistent.scala
 * (c) Simula. on 22 nov. 2013 10:51:20
 * By JC
 * Update 22 nov. 2013 10:51:20
 *
 * *******************************************************
 */
package main.scala.simula.common

/**
 * @author JC
 *
 */
@serializable trait Persistent extends Serializable {

  def saveOnDisk(rootPath: String) = {
    import scala.util.Marshal
    import java.io._
 
        val output = new FileOutputStream(rootPath)
        output.write(Marshal.dump(this))
        output.close
 
// 		To load data (in an eventually loaderManager class)
//        val input = new FileInputStream("out")
//        val data = Stream.continually(input.read).takeWhile(-1 !=).map(_.toByte).toArray
//        val bar: Type = Marshal.load[Type](data)
// 


    true;
  }
  def saveOnDB(base: String, host: String, user: String, pwd: String) = {
    import scala.util.Marshal
    System.out.println("SaveOnDB not implemented")
    false
  }


}