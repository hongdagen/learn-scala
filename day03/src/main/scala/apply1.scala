object apply1 {
//  def main(args: Array[String]): Unit = {
//    //new在堆内存里面开辟了空间 10个空间默认0
//    val arr = new Array(10)
//    val arr1 = Array(10)
//
//    //通常会在类的伴生对象中定义apply方法，
//    //当遇到类名(参数1...参数n)时 apply方法调用
//
//
//  }
}
class Person(var name:String,var age:Int){

}
object Person{
  def apply():Unit={
    println("apply")
  }
  def apply(name:String):Unit={
    println(name)
  }
  def apply(name:String,age:Int):Person={
      println(name+" "+age)
      new Person(name,age)
  }


  def main(args: Array[String]): Unit = {
    //val p = Person //执行不会apply都不会被调用
    //val p1=Person()
    //val p2 = Person("test")
    val p3 = Person("test",19)

  }
}
