package thisisnobody.basicCollections.map

import scala.collection.mutable.Map

/**
  * 可变和不可变
  */
object mutableMap {
  def main(args: Array[String]): Unit = {

    val map1 = Map[Int, String]()

    map1 += (1 -> "hello")
    map1 += (2 -> "hell")
    map1 += (3 -> "ho")
    println(map1(1))
    map1.foreach(println)
  }
}
