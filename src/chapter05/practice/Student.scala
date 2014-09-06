package chapter05.practice

import scala.beans.BeanProperty

class Student {

  @BeanProperty var id: Long =_
  @BeanProperty var name: String =_
}