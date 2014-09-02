package chapter05

import scala.beans.BeanProperty

class Person {
	//var age = 0;
	
	// Getter age();
	// Setter age_=(int);
	
	private var privateAge = 0; // java private 변수
	
	def age = privateAge;
	def age_=(newValue: Int) {
	  if(newValue > privateAge) privateAge = newValue;
	}
	
	// 자바빈과 상호 호환 시 사용
	@BeanProperty var name: String = _;
	// name: String
	// name_=(newValue: String): Unit
	// getName(): String
	// setName(newValue: String): Unit
}

/*

public class Person {

	private int age;
	
	private int getAge(){ return age; }
	private void setAge(int newValue) {
		if(newValue > age) age = newValue;
		
	}
}
*/

