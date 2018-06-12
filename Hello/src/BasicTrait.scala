/**
  * 特征类似于Java的抽象类，但可以多继承
  */
trait BasicTrait {

  //未实现方法
  def isEqual(obj: Any): Boolean

  //实现方法
  def isNotEqual(obj: Any): Boolean = !isEqual(obj)
}

class Book(pages: Int) extends BasicTrait {

  var pageNum = pages

  def isEqual(obj: Any): Boolean = obj.isInstanceOf[Book] && obj.asInstanceOf[Book].pageNum == pageNum
}



