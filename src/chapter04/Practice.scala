package chapter04

object Practice {

	  def main(args: Array[String]) {
		  val devices = scala.collection.immutable.Map("Mac air" -> 1000000, "Mac Pro" -> 2450000);
		  val discountDevices = for((k, v) <- devices ) yield (k, (v * 0.9).toInt)
		  
		  println(discountDevices)
		  
		  val in = new java.util.Scanner(new java.io.File("./src/chapter04/MapTest.scala"))
		  val words = new scala.collection.mutable.HashMap[String, Int]
		  while (in.hasNext()) {
			  val word = in.next()
			  words(word) = words.getOrElse(word, 0) + 1
		  }
 
		  for ((word, count) <- words) {
			  printf("단어 \"%s\" -> %d%n", word, count)
		  }
 
	  }
}