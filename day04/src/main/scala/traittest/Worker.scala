package traittest

class Worker(var name:String) extends HelloTraint with MakeFriendsTrait{
  def sayHello(name:String): Unit ={
    println("hello"+name)
  }
  def makeFriends(w:Worker)=println("hello,my name is "+name+"you name is"+w.name)

}
