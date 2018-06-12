import java.io.{FileNotFoundException, FileReader}


object BasicException {
  def main(args: Array[String]): Unit = {

    try {
      var file = new FileReader("hello.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("FileNotFoundException")
      }

    } finally {
      println("Whatever happened, you come here")
    }
  }
}
