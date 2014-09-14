package chapter06

import chapter06.practice.Point
import chapter06.practice.Conversions
import chapter06.practice.InchesToCentimeters
import chapter06.practice.Card
import chapter06.practice.RGBCube

object Practice {
	def main(args: Array[String]){
	  println("12 inches = " + Conversions.inchesToCentimeters(12))
	  println("50 gallons = " + Conversions.gallonsToLiters(50))
	  println("80 miles = " + Conversions.milesToKilometers(80))
	  
	  
	  println(InchesToCentimeters.covert(12))
	  
	  val point = Point(3, 4)
	  println(point);
	  
	  println(Card.Clover )
	  
	  for (color <- RGBCube.values) {
		  println(color + " -> " + "0x%06X".format(color.id))
	  }
	}
}