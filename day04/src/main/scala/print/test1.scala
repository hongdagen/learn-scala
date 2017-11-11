package print

object test1 {
  def sayHello(name:String,age:Int)={
    println(s"hello:$name,age:$age")
  }
  def main(args: Array[String]): Unit = {
    sayHello("hyhy",18)
  }
}
