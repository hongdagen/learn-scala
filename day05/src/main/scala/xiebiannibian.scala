//协变 逆变
//协变：本身定义的是父类可以操作，但是子类也可以

class BaiJin
class WangZhe extends BaiJin
class Card[+T](val name:String)
object test{
  def wangzhePK(card:Card[BaiJin]):Unit={
    println("huanying")
  }
  def main(args: Array[String]): Unit = {
      val wangzhe=new Card[WangZhe]("wo")
      val baijin = new Card[BaiJin]("ni")

    wangzhePK(baijin)
    wangzhePK(wangzhe)
  }
}