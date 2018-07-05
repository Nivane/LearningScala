/**
  * zlp 2018.06.12
  * Scala基础 字符串 数组 迭代器
  */
object BasicScala {

  /*
  字符串和一般字符串方法
   */
  var hashimoto = "nanami"
  var ikuta = "erika"

  def main(args: Array[String]) {
    println("2  " + hashimoto)
    println(ikuta)
    /*
    数组
     */
    val arr1: Array[String] = new Array[String](3)
    arr1(0) = "nogizaka"
    arr1(1) = "keyakizaka"
    arr1(2) = "yoshimotozaka"
    var arr2 = new Array[String](3)
    val arr3 = Array(
      "nogizaka",
      "keyakizaka",
      "yoshimotozaka"
    )

    for (
      i
        <- 0 until arr1.length
    ) {
      println(arr1(i))
    }

    println(arr3.length)
    for (
      i
        <- 0 until arr3.length
    ) {
      println(arr3(i))
    }

    val arr4 = Range(1, 10, 2)
    val arr5 = Range(1, 10)

    for (x <- arr4) {
      print(x + "\t")
    }
    println()
    for (x <- arr5) {
      print(x + "\t")
    }
    println()

    /**
      * 迭代器
      */

    val ite = Iterator(1,2,3,0,9,8,7,6,5)
    println(ite.size)
    println(ite.length)
    while(ite.hasNext){
      print(ite.next())
    }

    println()
    println(ite.size)
    println(ite.length)

  }

  var nogiBuilder = "nogizaka46"
  nogiBuilder += " is"
  nogiBuilder ++= " braaaaavo"
  println(nogiBuilder)

  val builderLength = nogiBuilder.length()
  println(builderLength)
  val hi = hashimoto.concat(ikuta)
  println(hi)
  println("1  " + hashimoto)
  println(ikuta)
  hashimoto = hashimoto.concat(ikuta)


}
