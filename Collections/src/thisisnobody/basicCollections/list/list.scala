package thisisnobody.basicCollections.list

/**
  * List一旦创建，不可改变
  * Nil空List
  * 可以使用::和:::组成新的List
  */
object list {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)

    for (i <- 0 until 4) {
      print(list(i) + "\t")
    }

    println
    val list1 = List((1, 1), (2, 2), (3, 3), (4, 4))

    for (i <- 0 to 3) {
      println("(" + list1(i)._1 + ", " + list1(i)._2 + ")")

    }


    val v = List(1, 2)
    val w = List(3, 4)
    // :::两个List组合成新的List
    val x = v ::: w
    for (i <- 0 until x.length) {
      print(x.apply(i) + "\t")
    }
    println


    val y = 1000 :: v
    for (i <- 0 until y.length) {
      print(y.apply(i) + "\t")
    }
    println
    println(y.mkString(", "))
  }
}
