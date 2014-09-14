package chapter06.practice

abstract class UnitConversion(val rate: Double) {

	def covert(value: Double) = {
	  value * rate
	}
	
}