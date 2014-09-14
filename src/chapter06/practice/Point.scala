package chapter06.practice

class Point(private val x: Int, private val y: Int) {
	override def toString() = "Point { x = " + x + ", y = " + y + " }"
}

object Point {
	def apply(x: Int, y: Int) = new Point(x, y)
}