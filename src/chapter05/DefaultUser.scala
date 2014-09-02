package chapter05

class DefaultUser {
	
	private var name = ""
	private var age = 0
	
	def this(name: String) {
	  this()
	  this.name = name;
	}
	
	def this(name: String, age: Int) {
	  this(name)
	  this.age = age
	}
	
	def printOut = {
	  println(name + ": " + age)
	}
}