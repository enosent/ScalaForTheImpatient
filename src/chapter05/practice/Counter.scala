package chapter05.practice

class Counter {

  private var value:Int =_ // default value
  
  def increment(maxValue: Int) {
    if(maxValue > 0){
    	value += 1 
    }
  }
  
  def current() = value
}