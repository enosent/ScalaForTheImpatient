package chapter05

class Counter {

  private var value = 0; // 필드를 반드시 초기화해야 한다.
  
  def increment() { value += 1 }
  def current() = value;
}