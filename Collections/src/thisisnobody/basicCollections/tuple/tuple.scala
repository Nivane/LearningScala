package thisisnobody.basicCollections.tuple

/**
  * 元组不可变，但是可以存放不同类型的元素
  *
  */
object tuple {
  def main(args: Array[String]): Unit = {

    val pair = (100, "hello") //Tuple2[Int, String] 二元组
    println("(" + pair._1 + ", " + pair._2 + ")")

    val t2 = (1, "hello", (1, "hello")) //Tuple3[Int, String, Tuple2[Int, String]] 三元组
    println(t2._1, t2._2, (t2._3._1, t2._3._2))

    val list = List((t2))
    list.foreach(println)

  }
}
