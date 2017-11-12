package yinshizhuanhuan

//  2. 当一个对象调用某个方法，这个对象确实也有这个方法，但是参数类型不匹配
//  这个时候也会触发隐式转换
class SpecialPerson(var name:String)
class Student(var name:String)
class Older(var name:String)
class Worker(var name:String)
class TicketHouse(){
  var number:Int=0
  def buySpecialPerson(p:SpecialPerson):Unit={
    number+=1
    println("T-"+number)
  }
}
object test2 {
  //隐式转换
  implicit def object2SpecialPerson(obj:Object):SpecialPerson={
    if(obj.getClass==classOf[Student]){
        val student=obj.asInstanceOf[Student]//强制类型转换
        new SpecialPerson(student.name)
    }
    else if(obj.getClass==classOf[Older]){
      val older = obj.asInstanceOf[Older]
      new SpecialPerson(older.name)
    }
    else{
      None
    }
  }

  def main(args: Array[String]): Unit = {
    val house=new TicketHouse
    val student = new Student("hemeimei")
    house.buySpecialPerson(student)//数据类型不匹配
  }
}
