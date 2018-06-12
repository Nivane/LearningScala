/**
  * 提取器有两个方法apply unapply
  * 实例化时自动执行apply
  * 使用模式匹配match自动执行unapply
  */
object BasicExtractor {

  def main(args: Array[String]): Unit = {

    var extractor = BasicExtractor(5)
    println(extractor)

    extractor match {
      //这里的num是extractor执行了unapply之后的3吗
      case BasicExtractor(num) => println(extractor + " is twice of " + num)
      case _ => println("cannt be computed.")
    }


    var extractor1 = BasicExtractor(4)
    println(extractor1)

    extractor1 match {
      case BasicExtractor(num) => println(extractor1 + " is twice of " + num)
      case _ => println("cannt be computed.")
    }

  }

  def apply(x: Int) = x + 1

  def unapply(x: Int): Option[Int] = if (x % 2 == 0) Some(x / 2) else None
}
