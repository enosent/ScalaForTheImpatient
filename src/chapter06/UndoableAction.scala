package chapter06

abstract class UndoableAction(val description: String) {
  
  def undo(): Unit
  def redo(): Unit

}