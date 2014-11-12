package chapter06.practice

object RGBCube extends Enumeration {
  type RGBCube = Value
  val Blue = Value(0x0000ff)
  val Cyan = Value(0x00ffff)
  val White = Value(0xffffff)
  val Green = Value(0x00ff00)
  val Yellow = Value(0xffff00)
  val Red = Value(0xff0000)
  val Black = Value(0x000000)
  val Magenta = Value(0xff00ff)
}