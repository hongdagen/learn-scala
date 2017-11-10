object test3 {
  def main(args: Array[String]): Unit = {
    //val result=fn1(2,3)
    //println(result)
    //println(fn2(3,4))
    //println(fn3(fn4))
    println(arr.map(x=>x*2))
  }

  def fn1(x:Int,y:Int):Int={
    //方法写等号有返回值 不写没有
    //返回值类型可写可不写
      x*y
  }

  val fn2=(a:Int,b:Int) => a*b

  def fn3(f:(Int,Int)=>Int)=f(2,3)
  val fn4 = (aa:Int,bb:Int)=>aa+bb

  val arr = Array(1,2,3,4,5,6)
  val add = (au:Int)=>au*2
}
