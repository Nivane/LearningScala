package thisisnobody.basicCollections.map

/**
  * 可变和不可变
  */
object immutableMap {
  def main(args: Array[String]): Unit = {
    val map = Map(1 -> "hello", 2 -> "bye", 3 -> "hi")

    map.foreach(println)
  }
}
