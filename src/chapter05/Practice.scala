package chapter05

import chapter05.practice.BankAccount
import chapter05.practice.Time
import chapter05.practice.OtherTime
import chapter05.practice.PersonName
import chapter05.practice.Employee
import chapter05.practice.Employee
import chapter05.practice.QEmployee

object Practice extends App {

  val bank = new BankAccount()
  
  bank.deposit(10000)
  println(bank.balance)
  
  bank.withdraw(1000)
  println(bank.balance)
  
  val time = new Time(17, 30);
  
  println(time.before(new Time(18, 40)))
  
  val ot = new OtherTime(17, 40);
  
  println(ot.before(new OtherTime(18, 40)))
  
  val p1 = new chapter05.practice.Person(-10)
  println("age changed : " + p1.age)
  val p2 = new chapter05.practice.Person(10)
  println("age : " + p2.age)
  
  
  val personName = new PersonName("Fred Smith")
  
  println(personName.firstname);
  println(personName.lastname);
  
  
  val emp = new Employee();
  println(emp.name )
  
  val emp2 = new QEmployee();
  println(emp2.name +", " + emp2.salary );
}