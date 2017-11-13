package shangxiajie

class Yeye
class FuQin extends Yeye
class HaiZi extends FuQin
class TongZhuo

object test{
  def getId[R>:HaiZi](person:R):Unit={
    println("qu zou ")
  }

  def main(args: Array[String]): Unit = {
    //getId[Yeye](new Yeye)
  }
}