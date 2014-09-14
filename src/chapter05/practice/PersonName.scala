package chapter05.practice

class PersonName(private val name: String) {
	
	/*
	def firstname = {
	  name.split(" ")(0)
	}
	
	def lastname={
	  name.split(" ")(1)
	}
	*/
	def firstname = name.split(" ")(0)
	def lastname = name.split(" ")(1)
}