package clourse

object test1 {
  def main(args: Array[String]): Unit = {
    var factor = 3
    val mul =(i:Int)=>i*factor
    println(mul(3))
    factor = 4
    println(mul(3))
  }
}
