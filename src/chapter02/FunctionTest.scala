package chapter02

import java.text.MessageFormat

object FunctionTest {

  def main(args: Array[String]){
    
    val s = abs(-3);
    println(s);
    
    val r = fac(10);
    println(r);
    
    val d = fact(10);
    println(d);
    
    val str = decorate("Hello");
    println(str);
    
    val str2 = decorate("Hello", "<<", ">>");
    println(str2);
    
    val str3 = decorate("Hello", ">>>["); // 인자보다 적은 수의 인자를 주면 .. 뒤에서부터 기본값이 적용
    println(str3);
    
    val str4 = decorate(left = "<<<", str = "Hello", right = ">>>");
    println(str4);
    
    val str5 = decorate(str = "Hello", right = "]<<<");
    println(str5);
    
    val in = sum(1, 4, 9, 16, 25);
    println(in);
    
    // err: type mismatch; found : scala.collection.immutable.Range.Inclusive required: Int
    // sum(1 to 5);
    
    val in2 = sum(1 to 5: _*); // 1 to 5를 인자 시퀀스로 생각하라
    println(in2); 
    
    val in3 = recursiveSum(1 to 5: _*);
    println(in3);
    
    // err
    // - type mismatch; found : Int(42) required: Object
	// - the result type of an implicit conversion must be more specific than AnyRef
    // val text = MessageFormat.format("The answer to {0} is {1}", "everything", 42);
    // Object 타입의 가변 인자를 갖는 자바 메소드를 호출할 때 모든 기본 타입은 수동으로 변환해야 한다. 
    val text = MessageFormat.format("The answer to {0} is {1}", "everything", 42.asInstanceOf[AnyRef]);
    println(text);
    
    box("Hello");
  }
  
  def abs(x: Double) = if (x>=0) x else -x;
  
  // return 키워드가 필요없음.. 블록의 마지막 식이 함수가 리턴하는 값..
  // return은 호출자에 값을 리턴하지 않는다.. 
  // 바깥쪽의 이름 있는 함수에서 빠져 나온다.. return을 함수에서 사용하는 break문의 일종으로 생각하고 ... 사용하지 않는 편이 좋음 ..
  def fac(n: Int) = {
    var r = 1;
    for(i <- 1 to n) r = r * i;
    r
  }
  
  // 재귀함수는 리턴 타입을 명시해줘야함
  // recursive method fact needs result type
  def fact(n: Int): Int = if(n <= 0) 1 else n * fact(n - 1);
  
  // 기본 인자 지정
  def decorate(str: String, left: String = "[", right: String = "]" ) = left + str + right;
  
  def sum (args: Int*) = {
    var result = 0;
    for(arg <- args) result += arg;
    result;
  }
  
  def recursiveSum(args: Int*): Int = {
    if(args.length == 0) 0
    else args.head + recursiveSum(args.tail : _*);
  }
  
  // 프로시저 - = 심볼 없이 중괄호 안에 들어 있으면, 리턴 타입은 Unit
  //def box(s: String): Unit = { or
  def box(s: String) {
    val border = "-" * s.length() + "--\n";
    println(border+ "|" + s + "|\n" + border);
  }
}