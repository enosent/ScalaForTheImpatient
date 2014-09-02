package mini

import scala.util.Random

object ScalaInfo {

	def main(args: Array[String]){
	  
	  // val ( value ) vs var ( variable )
	  var a = 3
	  a = 4 // ( 가능)
	  
	  val b = 3
	  // b = 4 ( 불가능 : reassignment to val )
	  
	  // scala 모든 것이 객체 
	  println( 2 + 4 )
	  println( 2.+(4) )
	  
	  
	  println( "Hello".take(2) )
	  println( "Hello".drop(2) );
	  println( "Hello".takeRight(2) )
	  println( "Hello".dropRight(2) )
	  
	  
	  /* if-expression */
	  
	  // java 
	  // boolean b = new Random().nextBoolean();
	  // String res = if(b) "True" else "False"; compile error
	  
	  val rndBool = Random.nextBoolean
	  
	  val res = if(rndBool) "True" else "False"
	  println(res)
	  
	  // java
	  // String res = if(b) "True" else "False"; compile error
	  // String res = b ? "True" : "False";
	  
	  val x = 4
	  val d = if( x > 0) "positive" else -1
	
	  println(d)
	  
	  /* for-expression */
	  
	  for(i <- 0 to 10) println(i) // 1 ~ 10
	  for(i <- 0 until 10) println(i) // 1 ~ 9
	  
	  // for ( int i = 10; i >= 0; i-- ) System.out.println(i);
	  for(i <- 10 to (0, -1)) println(i);
	  
	  val ns = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
	  for(n <- ns) println(n) // ns(i)
	  
	  ns.foreach(println)
	  
	  // for 컴프리헨션 yield
	  val newArr = for (n <- ns) { n }
	  println("> " + newArr) // Unit
	  
	  val newArr2 = for (n <- ns) yield n 
	  println(newArr2.toBuffer)
	  
	  val newArr3 = for (n <- ns) yield n * 2
	  println(ns.toBuffer)
	  println(newArr3.toBuffer)
	  
	  val es = for (n <- ns; if n % 2 == 0) yield n  // ns.filter(_ % 2 == 0) _ == *
	  
	  val cs = Array("A", "B", "C", "D", "E")
	  
	  val newCS = for(c <- cs; n <- ns) yield c + n // cs.flatMap( c => ns.map( n => c + n))
	  println(newCS.toBuffer);
	  
	  /*
	  String[] cs = {"A", "B", "C", "D", "E"};
	  int[] is = {1, 2, 3, 4, 5};

	  List<String> res = new ArrayList<String>();
	  for(String c: cs) {
	  	  for(int i : is) {
	  	  	  res.add(c + i);
	  	  }
	  }
	  */
	  
	  val newCS2 = for(c <- cs; n <- ns; if c != "C") yield c + n
	  println(newCS2.toBuffer)
	  
	  // function
	  
	  // array & map
	  
	  // class
	  
	}
}