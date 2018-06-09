package thisisnobody.scala.basic

object Sum {

  def main(args: Array[String]): Unit = {
    println(getSum(1, 2));
  }

  def getSum(a: Int, b: Int): Int = {
    var c = a + b;
    return c;
  }
}