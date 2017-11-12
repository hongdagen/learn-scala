package shangxiajie


class Boy(val name:String,val faceValue:Int) extends Comparable[Boy]{
  override def compareTo(o: Boy): Int = {
    o.faceValue-this.faceValue
  }

  override def toString: String = {
   (s"$name $faceValue")
  }

}
object test1 {
  def main(args: Array[String]): Unit = {
    val arr =Array[Boy](new Boy("hyhy",99),new Boy("wuyifan",9),new Boy("liyif",999))
    val result = arr.sorted
    println(result.toBuffer)
  }
}
