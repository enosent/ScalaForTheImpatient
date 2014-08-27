package chapter04

import scala.collection.JavaConversions.mapAsScalaMap;
import scala.collection.JavaConversions.propertiesAsScalaMap;

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
	  
	  scores2("Bob") = 10;
	  scores2("Fred") = 7;
	  
	  println(scores2.toBuffer);
	  
	  scores2 += ("Bobs" -> 10, "Freds" -> 7);
	  
	  println(scores2.toBuffer);
	  
	  // 키와 연관된 값 삭제
	  scores2 -= "Bobs";
	  scores2 -= "Freds";
	  
	  println(scores2.toBuffer);
	  
	  // 수정 불가능한 맵을 갱신할 수 없지만, 갱신이 반영된 새로운 맵 생성은 가능
	  val newScores = scores + ("Bob" -> 10, "Fred" -> 7);
	  println(newScores.toBuffer);
	  
	  // 수정 가능한 맵도 가능
	  var scores3 = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8); // 수정 불가
	  scores3 = scores3 + ("Bob"-> 10, "Fred" ->7);
	  println(scores3.toBuffer);
	  
	  scores3 = scores3 - "Fred";
	  println(scores3.toBuffer);
	  
	  // 맵 반복
	  println(scores.keySet); // Set(Alice, Bob, Cindy)
	  for(v <- scores.values) println(v);
	  
	  // 키와 값을 교환 
	  val reverseScores = for((k, v) <- scores) yield (v, k);
	  println(reverseScores.toBuffer); // ArrayBuffer((10,Alice), (3,Bob), (8,Cindy))
	  
	  // 자바연동
	  val scoresJava: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int];
	  
	  val props: scala.collection.Map[String, String] = System.getProperties();
	  println(props.toBuffer);
	  
	  // Tuple
	  val t = (1, 3.14, "Fred"); // Tuple[Int, Double, java.lang.String]
	  println(t._2);
	  
	  val (a1, a2, a3) = t;
	  println(a1 + ", " + a2 + ", " + a3);
	  
	  val (b1, _ , b2) = t;
	  println(a1 + ", " + b2);
	  
	  val symbols = Array("<", "-", ">");
	  val counts = Array(2, 10, 2);
	  val pairs = symbols.zip(counts);
	  // val pairs = symbols.zip(counts).toMap .. 맵으로 변환
	  
	  println(pairs.toBuffer);
	  
	  for((s, n) <- pairs) Console.print(s * n);
	}
}