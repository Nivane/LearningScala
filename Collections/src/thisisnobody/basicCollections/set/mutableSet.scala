package thisisnobody.basicCollections.set

import scala.collection.mutable._;

/**
  * Collection分为可变和不可变类型
  * scala.collection.immutable
  * scala.collection.mutable
  */
object mutableSet {

  def main(args: Array[String]): Unit = {
    //创建了可变的Set
    var person = Set("child","adult")
    //简单的加到自身
    person += "oldman"
    println(person.contains("baby"))
  }
}
