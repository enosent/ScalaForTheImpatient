package coursera

object currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(157); 
  
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
  	def loop(a: Int, acc: Int): Int = {
  		if(a > b) a
  		else loop(a, acc)
  	}
  	
  	loop(a, b)
  };System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""")}
}
