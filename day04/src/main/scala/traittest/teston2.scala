package traittest

object teston2 {
  //trait 特质 有接口的特性
  //特质里面的方法可以实现也可以不实现
  // 实现特质，如果没有继承其他类 那么使用第一个特质使用extends
  //后面的使用with

  //  trait A{}
  //  trait B{}
  //  class C extends A with B{
  //  }


  def main(args: Array[String]): Unit = {
    val p1 = new Worker("xiaoma")
    val p2 = new Worker("xiaolv")
    p1.sayHello("xiaolvlv")
    p1.makeFriends(p2)
  }
}
