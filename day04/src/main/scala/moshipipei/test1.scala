package moshipipei

import scala.util.Random

// 模式匹配
object test1 {
  def main(args: Array[String]): Unit = {
    //1.根据具体的值 匹配 可以匹配字符串
    val arr = Array("hadoop","HBase","Spark")
    val name = arr(Random.nextInt(arr.length))
    name match{
      case "hadoop" => println("哈到普")
      case "HBase" =>println("H贝斯")
      case  _ => println("haha？")
    }
  }
}
