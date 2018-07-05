object BasicRegex {
  /**
    * 正则表达式 regex
    * @param args
    */
  def main(args: Array[String]): Unit = {

    val str = "Scala is from Java and scala is bravo"
    val pattern = "(S|s)cala".r

    println(pattern.replaceAllIn(str, "haha"))

  }
}
