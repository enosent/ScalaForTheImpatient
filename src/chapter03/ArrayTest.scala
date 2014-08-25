package chapter03

import scala.collection.mutable.ArrayBuffer;

object ArrayTest {

	def main(args: Array[String]) {
	  val nums = new Array[Int](10); // 10개 정수 배열, 모두 0으로 초기화
	  val a = new Array[String](10); // 10개 원소의 문자열 배열, 모두 null로 초기화
	  
	  // 길이 2의 Array[String] - 타입은 추론된다.
	  // 노트 : 초기값을 줄 때는 new가 없음
	  val s = Array("Hello", "World");
	  
	  s(0) = "Goodbye";
	  // Array("Goodbye", "World");
	  // 원소 접근에는 []가 아닌 ()를 사용한다.
	  
	  println(s.toBuffer);
	  
	  val b = ArrayBuffer[Int]();
	  // 혹은 new ArrayBuffer[Int]
	  // 정수를 저장할 수 있는 빈 배열 버퍼
	  
	  b += 1
	  // ArrayBuffer(1)
	  // += 로 원소를 끝에 더한다.
	  
	  b += (1, 2, 3, 5);
	  // ArrayBuffer(1, 1, 2, 3, 5)
	  // 괄호 안에 넣어서 여러 원소를 끝에 더한다.
	  
	  b ++= Array(8, 13, 21)
	  // ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
	  // ++= 연산자로 어떤 콜렉션이나 덧붙일 수 있다.
	  
	  b.trimEnd(5);
	  // ArrayBuffer(1, 1, 2)
	  // 마지막 5개 원소를 제거한다.
	  
	  b.insert(2, 6);
	  // ArrayBuffer(1, 1, 6, 2)
	  // 인덱스 2 앞에 삽입한다.
	  
	  b.insert(2, 7, 8, 9);
	  // ArrayBuffer(1, 1, 7, 8, 9, 6, 2)
	  // 원하는 수의 원소만큼 삽입할 수 있다.
	  
	  b.remove(2);
	  // ArrayBuffer(1, 1, 8, 9, 6, 2)
	  
	  b.remove(2, 3);
	  // ArrayBuffer(1, 1, 2)
	  // 두 번째 인자는 얼마나 많은 원소를 제거할지 결정한다.
	  
	  println(b.toBuffer);

	  val arr = ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8 , 9);
	  for(i <- 0 until arr.length)
	    println(i + " : " + arr(i));
	  
	  println();
	  // 매 두번째 원소를 방문
	  for(i <- 0 until (arr.length, 2))
	    println(i + " : " + arr(i));
	  
	  println();
	  // 배열 끝을 시작으로 원소를 방문
	  for(i <- (0 until arr.length).reverse)
	    println(i + " : " + arr(i));
	  
	  println();
	  for(elem <- arr)
	    println(elem); // elem 변수는 arr(0), arr(1) 등의 값으로 설정된다.
	  
	  // 배열을 받아서 어떤 방법으로 변환하는 것이 매우 쉽다.
	  // 새 콜렉션 .. 기존 콜렉션은 영향을 받지 않는다.
	  val arrs = Array(2, 3, 5, 7, 11);
	  val result = for(elem <- arrs) yield 2 * elem;

	  println(result.toBuffer);
	 
	  // 배열의 짝수 원소만 2배로
	  val result2 = for(elem <- arrs if elem % 2 == 0) yield 2 * elem;
	  
	  println(result2.toBuffer);
	  
	  val result3 = arrs.filter(_ % 2 == 0).map(2 * _);
	  println(result3.toBuffer);
	  
	  val result4 = arrs filter { _%2 == 0 } map { 2*_ }
	  println(result4.toBuffer);
	}
	
}