package chapter05

import chapter05.practice.BankAccount
import chapter05.practice.Time

object Practice extends App {

  val bank = new BankAccount()
  
  bank.deposit(10000)
  println(bank.balance)
  
  bank.withdraw(1000)
  println(bank.balance)
  
  val time = new Time(17, 30);
  
  println(time.before(new Time(18, 40)))
}