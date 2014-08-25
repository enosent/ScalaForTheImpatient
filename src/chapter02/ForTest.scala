package chapter02

object ForTest {

  def main(args: Array[String]){
    val n = 10;
    for ( i <- 1 to n){
      print(i + "\t");
    }
    println();
    
    // 1 ~ n-1
    for ( i <- 1 until n){
    	print(i + "\t");
    }
    println();
    
    val s = "Hello";
    var sum = 0;
    
    for(i <- 0 until s.length())
      sum += s(i);
    
    println(sum);
    
    var sum2 = 0;
    for(ch <- "Hello") sum2 += ch;
    
    println(sum2);
    
    for(i <- 1 to 3; j <- 1 to 3) print((10 * i + j) + "  ");

    println();
    
    for(i <- 1 to 3; j <- 1 to 3 if i != j) print((10 * i + j) + "  ");
    
    println();
    
    for( i <- 1 to 3; from = 4 - i; j <- from to 3) print((10 * i + j ) + "  ");
    
    println();

    for{ i <- 1 to 3
    	 from = 4 - i
    	 j <- from to 3}
    
    print((10 * i + j ) + "  ");
    
    println();
    
    // 컴프리헨션
    val arr = for(i <- 1 to 10) yield i % 3
    
    println(arr);
    
    val arr2 = for(c <- "Hello"; i <- 0 to 1) yield (c+i).toChar
    
    println(arr2);
    
    val arr3 = for(i <- 0 to 1; c <- "Hello") yield (c+i).toChar
    
    println(arr3);
  }
}