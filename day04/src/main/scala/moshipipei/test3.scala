package moshipipei

object test3 {
  def main(args: Array[String]): Unit = {
    //3.匹配数组
//    val arr = Array(0,1,7,0)
//    arr match{
//      case Array(1,1,1,y)=>println(" "+y)
//      case Array(1,1,7,y)=>println("only0")
//      case Array(0,_*)=>println("0....")
//      case _ =>println("else")
//    }
    //匹配列表
//    val list = List(1,0,0)
//    list match{
//      case 0 :: Nil => println("only 0")//0后跟空列表
//      case x :: y::Nil=>println(s"x $x y $y")//两个数跟一个空
//      case 0 ::a=>println(s"0.......$a")//0后跟任意值
//      case _ =>println("else")
//    }
    //匹配元组
    val tup = (0,0,0)
    tup match{
      case (1,x,y)=>println(s"hello 123 $x $y")
      case (_,z,5)=>println(z)
      case _=>println("else")
    }
  }
}
