import java.io.{FileNotFoundException, FileReader}


object BasicException {
  def main(args: Array[String]): Unit = {

    try {
      val file = new FileReader("hello.txt")
      file.close()
    } catch {
      case ex: FileNotFoundException => {
        println("FileNotFoundException")
        println(ex.printStackTrace())
      }

    } finally {
      println("Whatever happened, you come here")
    }
  }
}
