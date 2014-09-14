package chapter06.practice

object Card extends Enumeration {
	
	type Card = Value
	val Clover = Value(0, "♣")
	val Dimond = Value(1, "◆")
	val Heart = Value(2, "♥")
	val Spade = Value(3, "♠")
}