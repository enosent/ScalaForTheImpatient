package coursera

import scala.annotation.tailrec

object TailRecursion {

  def main(args: Array[String]){
	  val result1 = gcd(21, 14)
	  println(result1)
	  
	  val result2 = factorial(4)
	  println(result2)
	  
	  
	  //val test = "I told him (that it's not (yet) done).\n(But he wasn't listening)".toList;
	  val test = "()))".toList;
	  
	  println(balance(test));
	  
	  println(countChange(4,List(1,2), "start"))
  }
  
  @tailrec
  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
		  
  def factorial(n: Int): Int =
		  if (n == 0) 1 else n * factorial(n - 1)
		  
  def balance(chars: List[Char]): Boolean = {
    def iterate(chars: List[Char], acc: Int): Int = {
      println("chars : " + chars)
      println("acc : " + acc)
      
      if (chars.isEmpty || acc < 0) acc
      else if (chars.head == '(') iterate(chars.tail, acc + 1)
      else if (chars.head == ')') iterate(chars.tail, acc - 1)
      else iterate(chars.tail, acc)
    }
    iterate(chars, 0) == 0
  }  		  
  
  def countChange(money: Int, coins: List[Int], text: String): Int = {
    println(text + " > " +money + " , " +  coins)
	if (money == 0) 1
    else if (money < 0 || coins.isEmpty) 0
    else if (money <= 0 && !coins.isEmpty) 0
    else countChange(money, coins.tail, "first") + countChange(money - coins.head, coins, "second")  
  }
}