package moshipipei

object test2 {
  def main(args: Array[String]): Unit = {
    // 2.能匹配类型而且把值传过去
    val arr = Array("hello",1,2.0,test2,2L)
    val elem = arr(3)
    //println(elem)
    elem match{
      case x:Int =>println("Int"+x)
      case y:Double if(y >= 0) =>println("Double"+y)
      case z:String=>println("String"+z)
      case test2=>{
        println("case test2")
      }
      case _=>
        println("default")
    }
  }
}
