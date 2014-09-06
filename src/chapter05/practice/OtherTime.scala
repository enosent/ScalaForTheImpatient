package chapter05.practice

class OtherTime(private var hours: Int, private var minutes: Int) {

  private val times = (hours * 60) + minutes
  
  def before(other: OtherTime): Boolean = {
    times < other.times
  }
}