package chapter06

object TrafficLightColor extends Enumeration {

  // val Red, Yellow, Green = Value;
  // [ output ] TrafficLightColor.ValueSet(Red, Yellow, Green)
  
  val Red = Value(0, "Stop")
  val Yellow = Value(10) // Value : Yellow
  val Green = Value("Go") // Id: 11 ( id 미지정시 앞에 할당된 값 + 1 )
  // [ output ] TrafficLightColor.ValueSet(Stop, Yellow, Go)
}