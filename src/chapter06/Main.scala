package chapter06

import TrafficLightColor._

object Main {

  def main(args: Array[String]) {
    println(Accounts.newUniqueNumber())
   
    val acc = new Accounts();
    acc.deposit(0.3);
    println(acc.balanceInfo);
    
    val act = DoNothingAction
    println(act);
    
    val acct = Accounts(100.0);
    println(acct.balanceInfo);
    
    /*
     * Array(100) vs new Array(100)
     * 
     * 첫 번째 식은 apply(100)을 호출하여 하나의 원소 정수 100을 가진 Array[Int] 리턴
     * 두 번째 식은 생성자 this(100)을 호출.. 100개의 null 원소를 가진 Array[Nothing] 
     */
    
    
    println(TrafficLightColor.values );
    
    println(TrafficLightColor.withName("Yellow") );
  }
}