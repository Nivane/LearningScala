/**
  * 模式匹配
  * x如果与y匹配则返回z
  * x match{
  * case y => z
  * }
  */
class BasicMatch {

  def matchTest(obj : Any) : String = obj match{
    case Person("shida", 21) => "im shida, 21"
    case Person("hashimoto", 26) => "im hashimoto, 26"
    case _ => "Sorry dont know u"
  }
}

//样例类
case class Person(name :String, age : Int)
