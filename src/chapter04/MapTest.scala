package chapter04

object MapTest {
	
	def main(args: Array[String]) {
	  val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8); // 수정 불가
	  
	  println(scores.toBuffer);
	  
	  val scores2 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8); // 수정 가능
	  // new scala.collection.mutable.HashMap[String, Int]; - empty map
	  
	  val bobsScore = scores("Bob"); // scores.get("Bob");
	  println(bobsScore);
	  
	  val bobsScore2 = scores.getOrElse("Boeb", 0); // if(scores.contains("Bob")) scores("Bob") else 0
	  println(bobsScore2);
	}
}