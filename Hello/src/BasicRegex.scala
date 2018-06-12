object BasicRegex {
  /**
    * 正则表达式 regex
    * @param args
    */
  def main(args: Array[String]): Unit = {

    var str = "Scala is from Java and scala is bravo"
    var pattern = "(S|s)cala".r

    println(pattern.replaceAllIn(str, "haha"))

  }
}
