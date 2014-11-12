package chapter06

class Accounts {
  val id = Accounts.newUniqueNumber();
  private var balance = 0.0
  
  def deposit(amount: Double) { 
    println("class")
    balance += amount
  }
  
  def this(id: Int, initialBalance: Double) {
    this()
    this.balance = initialBalance
  }
  
  def balanceInfo  = balance
}

// 컴패니언 오브젝트
object Accounts {

  private var lastNumber = 0
  
  def newUniqueNumber() = { 
    println("object") 
    lastNumber += 1; lastNumber 
  }
  
  // 컴패니언 클래스의 오브젝트를 리턴한다.
  def apply(initialBalance: Double) = new Accounts(newUniqueNumber(), initialBalance)
}

// scala 의 object class는 java의 singleton

/*
컴패니언 오브젝트(Companion Object)
클래스의 이름과 같은 이름을 사용하는 싱글톤 오브젝트를 클래스와 연결하여 companion object라고 부르고 연결된 클래스는 Companion class
컴패니언 오브젝트와 클래스는 서로  제한이 전혀 없기 때문에 private필드나 메서드에 접근 가능
*/