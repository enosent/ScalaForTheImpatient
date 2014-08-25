package chapter02

object Practice {

	def main(args: Array[String]) {
		val x = -3;

		println(signum(x));

		println("{} = " + {} + ", isInstanceof Unit = " + {}.isInstanceOf[Unit])

		//assign();
		//forloop();

		countdown(-10)
		countdown(0)
		countdown(10)
		
		wordCount("Hello");
		
		println(product("Hello"));

		println(calc(2, 4));
	}


	def signum(x: Int) = if(x > 0) 1 else if(x == 0) 0 else if(x < 0) -1 else();

	def assign() = {
		//not found: value y
		var x: Unit = ()
		var y = 0
		x = y = 1
		println("x 가 Unit 타입일 때? - " + x)

		println("x : " + x);
		println("y : " + y);
		/*
	    	x : ()
			y : 1
		 */
	}

	def forloop() = {
		// for ( int i = 10; i >= 0; i-- ) System.out.println(i); 
		for(i <- 10 to (0, -1)) println(i);
	}

	def countdown(n: Int) = {
		val step = if(n < 0) 1 else -1;

		for(i <- n to (0, step)) println(i);
	}
	
	def wordCount(word: String) = {
		var count = 1L;
		for(ch <- word) count *= ch.toLong;
		
		println(count);
				
		println(word.map(_.toLong).product );
	}
	
	def product(s: String) = {
	  var wordCount = 1L;
	  for(ch <- s) wordCount *= ch.toLong;
	  
	  wordCount;
	}
	
	// Char형 가변인자 함수
	def recursiveProduct(chars: Char*): Long = {
	  if(chars.length == 0) return 1L;
	
	  // 시퀀스의 head는 초기 원소.. tail은 나머지 모든 원소의 시퀀스 .. 인자 시퀀스로 변환 _* 
	  // chars.tail로 호출 할 경우 
	  // err : Multiple markers at this line
	  // - type mismatch; found : Seq[Char] required: Char
	  chars.head * recursiveProduct(chars.tail:_*);
	}
	
	def calc(x: Long, n: Long): Long = {
	  if(n > 0){
		  if(n%2 == 0 && n > 2) calc(calc(x, n/2), 2);
		  else x*calc(x, n-1);
	  }
	  else if(n < 0) 1/calc(x, -n);
	  else 1L;
	}
}