package chapter05.practice

class QEmployee {

  private var qName = "John Q. Public"
    
  var salary: Double = 0.0
  
  def this(name: String, salary: Double){
    this()
    qName = name;
    this.salary  = salary
  }
  
  def name = qName
}