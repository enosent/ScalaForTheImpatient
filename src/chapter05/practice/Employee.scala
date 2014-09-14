package chapter05.practice

class Employee(val name: String, var salary: Double) {
	def this() { this("John Q. Public", 0.0) }
}