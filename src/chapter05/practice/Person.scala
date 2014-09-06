package chapter05.practice

class Person(private var privateAge: Int) {

  if(privateAge < 0){
    privateAge = 0
  }
  
  def age = privateAge 
  
  def age_=(newAge: Int) {
    if(newAge > privateAge ) privateAge = newAge
  }
}