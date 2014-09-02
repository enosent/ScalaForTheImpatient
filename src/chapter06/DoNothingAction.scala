package chapter06

// 공유 가능한 디폴트 오브젝트 
object DoNothingAction extends UndoableAction("Do nothing") {

  override def undo(){
    
  }
  
  override def redo(){
    
  }
}