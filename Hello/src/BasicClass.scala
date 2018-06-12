/**
  * zlp 2018.06.12
  *
  * @param xc
  * @param yc
  */
class Point(val xc: Int, val yc: Int) {
  var x = xc;
  var y = yc;

  def move(movex: Int, movey: Int) {
    x = x + movex
    y = y + movey
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

  def move(movex: Int, movey: Int, movez: Int): Unit = {
    println("当前坐标：(x, y, z) : (" + x + ", " + y + ", " + z + ")")
    x = x + movex
    y = y + movey
    z = z + movez
    println("x移动" + movex)
    println("y移动" + movey)
    println("z移动" + movez)
    println("移动后坐标：(x, y, z) : (" + x + ", " + y + ", " + z + ")")

  }
}

object Test {
  def main(args: Array[String]) {
    /**
      * 类和继承
      */
    var loc = new Location(1, 2, 3)
    loc.move(3, 2, 1)

    /**
      * 特征类似于Java抽象类，但可以多继承
      */
    var book = new Book(10)
    var book1 = new Book(10)
    var book2 = new Book(20)
    var book3 = new Book(30)

    println(book1.isNotEqual(book))
    println(book1.isNotEqual(book1))
    println(book1.isNotEqual(book2))
    println(book1.isNotEqual(book3))

    /**
      * 模式匹配match
      */
    var p1 = new Person("shida", 21)
    var p2 = new Person("hashimoto", age = 26)
    var p3 = new Person("ikuta", 22)

    var basicMatch = new BasicMatch()
    println(basicMatch.matchTest(p1))
    println(basicMatch.matchTest(p2))
    println(basicMatch.matchTest(p3))



  }
}


