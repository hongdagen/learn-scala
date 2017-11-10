import scala.collection.mutable.ListBuffer

object test3 {
  def main(args: Array[String]): Unit = {

    //list 不可变
//    val list = List(1,2,3,4)
//    val list2=0::list
//    val list3 = list ++ list2
//    println(list3)
    //list 可变
//    val list4 = ListBuffer(1,2,3)
//    list4 += 4
//    val list5 = ListBuffer(5,6)
//    list4 ++=list5
//    println(list4)
    val list6 = List(1,2,3,4,5)
    println(list6.head)//取第一个数
    println(list6.tail)//取除第一个数之后的
    println(list6.reduce(_+_))// list6.reduce((x:Int,y:Int)=>x+y)
  }
}
