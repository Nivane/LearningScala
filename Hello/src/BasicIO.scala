import java.io.{File, PrintWriter}

import scala.io.Source

/**
  * Basic IO
  */
object BasicIO {
  def main(args: Array[String]): Unit = {

    /*
      屏幕读取
     */

    var line = Console.readLine()
    println("Input: " + line)

    /*
      文件写
     */
    val writer = new PrintWriter(new File("hello.txt"))
    writer.write(line)
    writer.close()

    /*
      文件读
     */

    Source.fromFile("hello.txt").foreach {
      print
    }
  }
}
