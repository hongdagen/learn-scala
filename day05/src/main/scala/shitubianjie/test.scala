package shitubianjie


//视图边界  A<% B 左侧的类型必须是右侧的子类。
  // 如果不是，那么左侧要隐士转换成为右边的子类

class Person(var name:String){
  def sayHello=println("hello i am "+ name)
  def makeFriends(p:Person):Unit={
    sayHello
    p.sayHello
  }

}

class Student(name:String) extends Person(name)
class Dog(var name:String)
class Worker(var name:String)
class Patty[T <% Person](p1:T,p2:T){
  def play():Unit= {
    p1.makeFriends(p2)
  }
}
object test{
    implicit def dogToPerson(dog:Object):Person={
      if(dog.isInstanceOf[Dog]) {
        val wang = dog.asInstanceOf[Dog]
        new Person(wang.name)
      }else{
        None
      }
  }

  def main(args: Array[String]): Unit = {
    val heihei=new Student("heihei")
    val wangcai = new Dog("wangcai")
    val patty=new Patty[Person](heihei,wangcai)
    patty.play()
  }
}