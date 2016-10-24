/**
  * Created by chenhao on 2016/10/8.
  */
class first {

}
object first{
  def main(args: Array[String]): Unit = {
    val str:Int = 1
    var s:String = "123"
    var x = 1.0f;
    var m = test("chen")

    printf("hello,world"+str)
    printf(m)
    val result = (x:Int)=>x*x
    println(result(2)+"")
    println(plus(1,2))
    println(bigger(-2))


  }

  def test(x:String):String = {
    x+"nihao"
    "e"
  }
  def plus(a:Int,b:Int):Int = {
    def sq(x:Int): Int ={
      x*x
    }
    sq(a)+sq(b)
  }

  def bigger(n:Int): Int ={
    if (n>0) n
    else -n
  }
}
