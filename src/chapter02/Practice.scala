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
		
		wordCount("Hello")
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
}