package curring

object test1 {
  def main(args: Array[String]): Unit = {
    //柯里化
    println(curry(3)(4))
  }
  def curry(x:Int)=(y:Int)=>x-y

}
