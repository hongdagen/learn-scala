
/*
*主构造函数   与类名交织在一起 val id:Int,var name:String
* 辅助构造函数
*
* */

//class Person(val id:Int,var name:String) {
//  var age:Int = 23
//  var address:String = "bj"
//  //辅助构造函数
//  def this(id:Int,name:String,age:Int){
//    this(id,name)//辅助构造函数第一行代码必须调用主构造函数或其他辅助构造函数
//    this.age = age
//  }
//  def this(name:String,id:Int,age:Int,address:String){
//    this(id,name,age)
//    this.address=address
//  }
//
//}
//
//object Test{
//  def main(args: Array[String]): Unit = {
//      val person = new Person(18,"hyhy")
//  }
//}
