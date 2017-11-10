import scala.collection.mutable.ArrayBuffer

object test1 {
  def main(args: Array[String]): Unit = {
    定长数组（不能添加数据，但可以修改值）
    变长数组（可以添加数据）

    //变长数组
    val arr = ArrayBuffer[Int]()
    arr += (1,2,3,4,5,6)
    //println(arr(0))
    arr ++= Array(7,8)
    println(arr)
    arr.insert(0,-1,100) //0位置前添加-1 和 100
    println(arr)
    arr.remove(0,2) // 下标0，1的元素
    println(arr)
    */

    val arr = Array(1,2,3,4,5)
    //for(i<-arr) println(i)

    for(i<-(0 until arr.length).reverse) println(i)
    //4 3 2 1 0

    //yield关键字将原始的数组进行转换会产生一个新的数组，原始数组不变
    val arr = Array(1,2,3,4,5)
    val arrNew = for(i<-arr) yield i*2
    println("arrNew:"+arrNew)
    println("arr:"+arr)
    //定长数组->变长数组  arr.toBuffer


    val  arr = Array(3,12,21,1,2)
    //正序排序
    arr.sorted
    //逆序排序
    arr.sortWith((x:Int,y:Int)=>x>y)
    //只能传一个变量，变成字符串
    arr.sortBy((x:Int)=>x+" ")
    //第一个减第二个，他俩的值减第三个 类推
    arr.reduce((x:Int,y:Int)=>x-y)

  }
}
