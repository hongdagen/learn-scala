import scala.collection.immutable.HashSet
import scala.io.Source

object test4 {
  def main(args: Array[String]): Unit = {
    //集合set里面没有重复元素  有可变不可变之分

    //不可变的
    //val set = HashSet(1,2,3)

    //读取文件
    //val file = Source.fromFile("文件名")
    //没有被执行 操作时候在执行
    lazy val file = Source.fromFile("文件名")


  }
}
