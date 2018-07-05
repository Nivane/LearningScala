/**
  * zlp 2018.06.12
  *
  * @param xc
  * @param yc
  */
class Point(val xc: Int, val yc: Int) {
  var x = xc;
  var y = yc;

  def move(moveX: Int, moveY: Int) {
    x = x + moveX
    y = y + moveY
  }

}

/**
  * 继承Point类
  *
  * @param xc
  * @param yc
  * @param zc
  */
class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z = zc

  def move(moveX: Int, moveY: Int, moveZ: Int): Unit = {
    println("当前坐标：(x, y, z) : (" + x + ", " + y + ", " + z + ")")
    x = x + moveX
    y = y + moveY
    z = z + moveZ
    println("x移动" + moveX)
    println("y移动" + moveY)
    println("z移动" + moveZ)
    println("移动后坐标：(x, y, z) : (" + x + ", " + y + ", " + z + ")")

  }
}

object Test {
  def main(args: Array[String]) {
    /**
      * 类和继承
      */
    val loc = new Location(1, 2, 3)
    loc.move(3, 2, 1)

    /**
      * 特征类似于Java抽象类，但可以多继承
      */
    val book = new Book(10)
    val book1 = new Book(10)
    val book2 = new Book(20)
    val book3 = new Book(30)

    println(book1.isNotEqual(book))
    println(book1.isNotEqual(book1))
    println(book1.isNotEqual(book2))
    println(book1.isNotEqual(book3))

    /**
      * 模式匹配match
      */
    val p1 = new Person("shida", 21)
    val p2 = new Person("hashimoto", age = 26)
    val p3 = new Person("ikuta", 22)

    val basicMatch = new BasicMatch()
    println(basicMatch.matchTest(p1))
    println(basicMatch.matchTest(p2))
    println(basicMatch.matchTest(p3))



  }
}


