package extend
//如果子类要覆盖一个父类中的非抽象方法，则必须使用override关键字
//如果子类覆盖父类方法之后，我们要调用父类的方法，使用super关键字
class Person {
  private var name = "leo"
  def getName = name
}
class Student extends Person{
  private var score = "A"
  def getScore = score

  override def getName: String = "hi,i am"+super.getName
}

object Test{
  def main(args: Array[String]): Unit = {
    var s =new Student()
    println(s.getName)
  }
}
