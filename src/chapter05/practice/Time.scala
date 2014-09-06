package chapter05.practice

class Time(private var hours: Int, private var minutes: Int) {

  def before(other: Time) = {
    (hours * 60) + minutes < (other.hours * 60) + other.minutes   
  }

}