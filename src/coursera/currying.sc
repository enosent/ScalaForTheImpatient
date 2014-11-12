package coursera

object currying {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
  	def loop(a: Int, acc: Int): Int = {
  		if(a > b) a
  		else loop(a, acc)
  	}
  	
  	loop(a, b)
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int
}