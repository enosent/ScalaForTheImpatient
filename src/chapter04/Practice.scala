package chapter04

import scala.collection.JavaConversions.mapAsScalaMap
import java.util.TreeMap
		   
import scala.collection.JavaConversions.propertiesAsScalaMap
import java.util.Calendar._

object Practice {

	  def main(args: Array[String]) {
		  val devices = scala.collection.immutable.Map("Mac air" -> 1000000, "Mac Pro" -> 2450000);
		  val discountDevices = for((k, v) <- devices ) yield (k, (v * 0.9).toInt)
		  
		  println(discountDevices)
		  
		  println("\n::Mutable Map::")
		  val in = new java.util.Scanner(new java.io.File("./src/chapter05/TimeOutput.scala"))
		  val words = new scala.collection.mutable.HashMap[String, Int]
		  while (in.hasNext()) {
			  val word = in.next()
			  words(word) = words.getOrElse(word, 0) + 1
		  }
 
		  for ((word, count) <- words) {
			  println(word + " -> " + count)
		  }

		  println("\n::Immutable Map::")
		  val in2 = new java.util.Scanner(new java.io.File("./src/chapter05/TimeOutput.scala"))
		  var words2 = new scala.collection.immutable.HashMap[String, Int]
		  
		  while(in2.hasNext()){
			  val word = in2.next();
			  //words2(word) = words2.getOrElse(word, 0) + 1
			  //err : value update is not a member of  scala.collection.immutable.HashMap[String,Int]
			  words2 = words2 + (word -> (words2.getOrElse(word, 0) + 1))
		  }
		  
		  for ((word, count) <- words2) {
			  println(word + " -> " + count)
		  }

		  println("\n::SortedMap::")
		  val sortedWords = scala.collection.immutable.SortedMap[String, Int](words2.toArray: _*)
		  
		  for ((word, count) <- sortedWords) {
			  println(word + " -> " + count)
		  }
		  
		  println("\n::TreeMap::")
		  val in3 = new java.util.Scanner(new java.io.File("./src/chapter05/TimeOutput.scala"))
		  val words3 = new TreeMap[String, Int]
		  
		  while(in3.hasNext()){
			  val word = in3.next()
			  words3(word) = words3.getOrElse(word, 0)+1
		  }
		  
		  for((word, count) <- words3){
		    println(word +" ->  "+ count)
		  }
		  
		  println("\n:: Day Of Week ::")
		  val dayOfWeek = scala.collection.mutable.LinkedHashMap("Monday" -> MONDAY, "Tuesday" -> TUESDAY, "Wednesday" -> WEDNESDAY)
		  for((k, v) <- dayOfWeek){
		    println(k +" -> "+ v);
		  }

		  val props : scala.collection.Map[String, String] = System.getProperties()
		  var longestLength = 0;
		  for (key <- props.keySet) {
			  longestLength = if (key.length > longestLength) key.length else longestLength
		  }
 
		  for ((key, value) <- props) {
			  printf("%-" + (longestLength + 1) +"s | %s%n", key, value)
		  }
		  
		  val (min, max) = minmax(Array(4, 32,65,34,78,32,12,65,76,98,0,5,2,34))
		  println("min : " + min +", max : " + max)		
		  
		  val (lt, eq, gt) = Iteqgt(Array(1,2,3,4,5,6,7,8,9,5,6,3,4,7,8,9,5,2,4,5,7), 5)
		  println(lt + " < " + 5 + " : " + eq + " < " + gt)
		  
		  println("zip : " + "Hello".zip("World"))
	  }
	  
	  def minmax(values: Array[Int]): (Int, Int)  = {
	    (values.max, values.min)
	  }
	  
	  def Iteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
	    var lt = 0
	    var eq = 0
	    var gt = 0
	    
	    for(value <- values){
	      if(value > v) gt += 1
	      else if(value < v) lt += 1
	      else eq += 1
	    }
	    
	    (lt, eq, gt)
	  }
}