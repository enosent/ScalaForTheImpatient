package chapter02

object IFtest {

  def main(args: Array[String]) {
    val x= 2;
	
    val s = if(x > 0) 1 else -1;
    
    // for java
    // int s = (x > 0)?1:-1
	
	println(s);
	
	val d = if( x > 0) "positive" else -1; // String, Int super type - [ Any ]
	
	println(d);
	
	val e = if(x <  0) 1 else ();
	println(e);
	
	val x0 = 2; val y = 8; val y0 = 4;
	
	val distance = { val dx = x - x0; val dy = y - y0; scala.math.sqrt(dx * dx + dy * dy); }
	
	println(distance);
	
  }
  
}