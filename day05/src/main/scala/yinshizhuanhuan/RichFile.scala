package yinshizhuanhuan
import java.io.File
import scala.io.Source

class RichFile(file:File) {
  def read():String={
    Source.fromFile(file).mkString
  }

}
object RichFile{
  def main(args: Array[String]): Unit = {
    implicit def fileToRichFile(file:File)=new RichFile(file)
    val result =new File("/Users/hongyi/IdeaProjects/day05/src/main/scala/yinshizhuanhuan/1.txt").read()
    println(result)
  }
}
