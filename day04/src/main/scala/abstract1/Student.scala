package abstract1
//抽象类
//如果在父类中，有些方法无法立即实现，而需要依赖不同的子类来覆盖，重写实现自己不同的方法实现
//此时可以将父类中的这些方法不给出具体的实现，只给方法签名 这是抽象方法
//
//而一个类中如果有一个抽象方法，那么这个类是抽象类  必须用abstract关键字声明 此时的抽象类不能实例化
//
//在子类中覆盖抽象类的抽象方法时，不需要使用override关键字
abstract class Person(val name:String){
  def sayHello:Unit
}
class Student extends Person("xiao"){
  def sayHello:Unit=println("hello"+name)
}
object test1{
  def main(args: Array[String]): Unit = {
    val s = new Student()
    s.sayHello
  }
}