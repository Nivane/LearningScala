package thisisnobody.basicCollections.set

/**
  * Collection分为可变和不可变类型
  * scala.collection.immutable
  * scala.collection.mutable
  */
object immutableSet {

  def main(args: Array[String]): Unit = {
    //创建了不可变的Set
    var person = Set("child","adult")
    //不是简单的加到自身，而是新集合重新赋值给person
    person += "oldman"
    println(person.contains("baby"))
  }
}
