package yinshicanshu

object test1 {
  def k1(x:Int)(y:Int)=x+y
  //从上往下找 匹配Int
  implicit val yy:Int=100

  //implicit val zz:Int=1000 //两个都符合条件 报错
  //import test2.a  //报错


  def k2(x:Int)(implicit y:Int=10)=x+y
  //implicit隐士的
  def main(args: Array[String]): Unit = {
    val result = k1(1)(2)
    println(result)
    val result2=k2(5)
    println(result2)
  }
}
