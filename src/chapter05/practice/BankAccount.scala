package chapter05.practice

class BankAccount {
  private var currentMoney: Int =_
  
  def balance = currentMoney
  
  def deposit(money: Int) = {
    currentMoney += money
  }
  
  def withdraw(money: Int) = {
	currentMoney -= money
  }
}