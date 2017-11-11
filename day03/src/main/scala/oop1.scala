

class Student {
  val id = 1 //如果用val修饰 就只有get方法 没有set方法
  var name: String = "tom" //var修饰 都有
  private var age = 18 //伴生对象可以使用私有变量
  private[this] val password = 123 //加上this连伴生对象都无法访问

  def getPassword(): Unit = {
    println(password)
  }
}

//半生对象  与类同名  object Student{}
//必须是同一个文件中 可以相互访问私有方法和属性
object oop1 {
  def main(args: Array[String]): Unit = {
    val s = new Student()
    println(s.id)
    println(s.name)
    s.name = "hyhy"
    println(s.name)
    //      s.age
    s.getPassword()
  }

}