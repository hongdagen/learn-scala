object scala_count {
  def main(args: Array[String]): Unit = {
    val arr = Array("a b c","a b c")
    // 将两数组变成一个数组 以空格分割         每一个数变成kv形式  以元组位置1来排序    打印(key -> value.length)
    arr.flatMap((x:String)=>x.split(" ")).map(x=>(x,1)).groupBy(_._1).foreach(t=>println(t._1+"->"+t._2.length))
  }
}
