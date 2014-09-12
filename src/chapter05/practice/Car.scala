package chapter05.practice

class Car(val product: String, val model: String) {

  private var year: Int = -1
  var license: String =_
  
  def this(product: String, model: String, year: Int){
    this(product, model)
    this.year = year
  }
  
  def this(product: String, model: String, license: String){
    this(product, model)
    this.license = license
  }
  
  def this(product: String, model: String, year: Int, license: String){
	  this(product, model)
	  this.year = year
	  this.license = license
  }

}