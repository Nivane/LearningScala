import java.util.Date

object Functions {

  def main(args: Array[String]): Unit = {
    // 1 按名传递函数
    showTIME(time())

    // 2 指定参数名函数
    printInt(1,2)
    printInt(a=1,b=2)

    // 3 可变参数函数
    printS(1, "hello", "kitty")

    // 4 递归函数
    println(fibonacci(10))

    // 5 默认参数值
    printSum()

    // 6 高阶函数
    println(fun1(fun2,10000))

    // 7 内嵌函数
    println(fibonacci(10, 10))

    // 8 匿名函数简写,左边参数，右边函数体
    val y = x(10)
    val z = x(20)
    println(y + z)

    // 9 偏应用函数
    val date = new Date
    val logWithBindDate = log(date, _ :String)
    logWithBindDate("hello")
    logWithBindDate("kitty")

    // 10 函数柯里化
    val HK = strAdd("hello")("kitty")
    println(HK)
  }



  // 1 按名传递参数函数
  // 使用一个返回值类型为Long的表达式作为参数，直到运行到t时才计算t的值
  def time() = {

    println("TimeStamp is ")
    System.nanoTime()

  }

  def showTIME( t : => Long) ={
    println("Begin the show")
    println("Show Time is " + t)
  }

  // 2 指定参数函数
  // 为函数指定参数类型和个数
  def printInt(a : Int, b:Int) = {

    println(a)
    println(b)
  }

  // 3 可变参数函数
  // 最后一个参数使用*，表示可以有1到多个相同的参数类型
  def printS(a:Int, b:String*): Unit ={
    println(a)
    for(B <- b){
      println(B)
    }
  }

  // 4 递归函数
  // 调用自身
  def fibonacci(a : Int):Int={
    if( a == 0 || a ==1){
      return 1;
    }

    return fibonacci(a - 1 ) + fibonacci( a - 2)

  }
  // 5 默认参数值
  // 函数参数值已确定
  def printSum(a :  Int = 5, b : Int = 5): Unit ={
    println(a  + b)

  }
  // 6 高阶函数
  // 操作其他函数的函数，其他函数作为参数或者返回值
  def fun1( fun2 : Int => String, p : Int) = fun2(p)

  def fun2[A]( i : A): String ={
    return i.toString
  }

  // 7 内嵌函数
  // 函数中定义其他函数
  def fibonacci(a : Int, b:Int):Int={

    def fib(a : Int ): Int ={

      return a * b
    }

    return fib(10)
  }


  // 8 匿名函数
  // 左边为参数列表，右边时函数体 ( a : Int) => a * 2
  // 等号左边是函数名
  var x = ( a : Int) => a * 2

  // 9 偏应用函数
  // 无需提供所有的参数，只需要提供部分的参数，通过赋值新的函数，减少参数数量
  def log(date : Date, msg : String): Unit ={
    println("Date: " + date + "  MSG: " + msg)

  }

  // 10 函数柯里化
  // 将参数变形分离，即strAdd(str1 : String) = (str2:String) => str1 + str2
  def strAdd(str1 : String)(str2 : String)  : String ={
    return str1 + str2
  }

}
