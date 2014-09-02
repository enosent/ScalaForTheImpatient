package chapter06

class Accounts {
  val id = Accounts.newUniqueNumber();
  private var balance = 0.0
  
  def deposit(amount: Double) { println("class"); balance += amount }
  
  def this(id: Int, initialBalance: Double) {
    this();
    this.balance = initialBalance;
  }
  
  def balanceInfo  = balance;
}

// 컴패니언 오브젝트
object Accounts {

  private var lastNumber = 0
  
  def newUniqueNumber() = { println("object"); lastNumber += 1; lastNumber }
  
  // 컴패니언 클래스의 오브젝트를 리턴한다.
  def apply(initialBalance: Double) =
    new Accounts(newUniqueNumber(), initialBalance);
}

// scala 의 object class는 java의 singleton