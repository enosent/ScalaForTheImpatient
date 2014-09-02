package chapter05

object ClassTest {

	def main(args: Array[String]) {
		val myCounter = new Counter; // or new Counter();
		
		// 상태 변경 메소드는 () .. 접근자 메소드는 () 생략
		myCounter.increment(); // 상태 변경 메소드 
		println(myCounter.current); // 접근자 메소드
		
		
		val fred = new Person();
		fred.age_=(32);
		fred.age = 21; // fred.age_=(21);
		println(fred.age); 
		
		// 필드가 비공개이면, Getter/Setter 비공개
		// 필드가 val, Getter만 생성
		// Getter, Setter가 필요없으면, 필드를 private[this]로 선언
		
		val msg = new TimeOutput();
		println(msg.message );
		
		
		new DefaultUser().printOut;
		new DefaultUser("user").printOut;
		new DefaultUser("user", 28).printOut;
		
		val user2 = new User("test", 30);
		println(user2.name );
		println(user2.age );
		
	}
}