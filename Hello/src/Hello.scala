/**
  * author: zlp 2018.06.11
  * Scala 基础
  */
object Hello {
  /**
    * @param a
    * @param b
    * @return 求和
    */
  def getSum(a: Int, b: Int): Int = {
    return a + b
  }

  def main(args: Array[String]): Unit = {


    val x = 1
    val y: Int = 2
    val z: Int = x + y
    println(z)
    //调用方法
    println(getSum(x, y))

    /* if else*/
    println("/*if else*/")
    if (x == 1) {
      println("x == 1")

    } else if (y != 1) {
      println("y == 1")
    } else {
      println("x != 1 && y != 1")
    }

    /* for循环*/
    println("/*for循环*/")
    var a = 0
    var b = 0
    var c = 0
    for (a <- 1 to 10) {
      print(a)
    }
    println()

    for (b <- 1 until 10) {
      print(b)
    }
    println()

    for (a <- 1 to 5; b <- 6 until 10) {
      print(a)
      print(b)
      print("\t")
    }
    println()

    val d = for (a <- 1 to 10) yield a
    for (a <- d) {
      print(a)
    }
    println()


    /*while循环*/
    println("/*while循环*/")
    var e = 0
    while (e < 20) {
      print(e + "\t")
      e = e + 1
    }
    println()

    /*方法与函数*/
    println("/*方法与函数*/")

    def f(x: Int) = x + 2

    val t = (x: Int) => x + 2

    println(f(10))
    println(t(10))

    /*闭包*/

    val memberNum = 43
    val getNogi = (x: Int) => x * memberNum
    println("Nogi 是一个闭包，因为它访问函数外面定义的变量")
    println(getNogi(10000))


  }


}