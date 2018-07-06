package thisisnobody.basicCollections.array

/**
  * 类型参数化数组
  */
object array {

  def main(args: Array[String]): Unit = {
    val greetingStrings = new Array[String](3)
    greetingStrings(0) = "Hello"
    greetingStrings(1) = "Kitty"
    greetingStrings(2) = "Bye"

    for (i <- 0 until greetingStrings.length) {
      println(greetingStrings(i))
    }

    /*
    上下方效果相同
    赋值是调用update
    获取值是调用apply
     */
    greetingStrings.update(0, "Oh")
    greetingStrings.update(1, "My")
    greetingStrings.update(2, "My")

    for (i <- 0 until greetingStrings.length) {
      println(greetingStrings.apply(i))
    }

    /*
    简洁版，自动获取Array类型
     */

    val simple1 = Array("Oh", "My")
    for (i <- 0 until simple1.length) {
      println(simple1.apply(i))
    }


  }
}
