package java12;


class Person extends ObjectClass13{
	long id;
	Person(long id){
		this.id =id;
		
	}
	public boolean equals(ObjectClass13 obj) {
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;
		}
		else {
			return false;
		}
	}
}


public class ObjectClass10 {
	
	
	
	public static void main(String[] args) {
		Person p01 =new Person(991025L);
		Person p02 = new Person(991025L);
		if(p01 == p02) {
			System.out.println("같은 사람이다");
		}
		else {
			System.out.println("다른 사람이다");
		}
		if(p01.equals(p02)) {
			System.out.println("같은 사람이다");
		}
		else {
			System.out.println("다른사람이다");
		}
	}

}



/*주어진 코드는 현재 객체(this)의 ID와 obj로 참조되는 객체의 ID를 비교합니다. 이 코드는 두 객체가 모두 Person 타입이고 id 속성을 가지고 있다고 가정합니다.

코드를 간단히 설명하면 다음과 같습니다:

((Person)obj)는 obj를 Person 객체로 캐스팅하려고 시도합니다. 이는 obj가 Person 타입이거나 Person을 상속받은 타입임을 가정합니다. 캐스팅이 실패하면 obj가 Person이나 그에 상속받은 타입이 아니기 때문에 예외가 발생합니다.

(Person)obj.id는 캐스트된 Person 객체의 id 속성에 접근합니다. 이는 Person 클래스가 id라는 공개 속성을 가지고 있다고 가정합니다.

id == ((Person)obj).id는 현재 객체의 id 속성(this.id)과 캐스트된 Person 객체의 id 속성을 비교합니다. ID가 같으면 true를 반환하고 그렇지 않으면 false를 반환합니다.

총적으로 이 코드 스니펫은 현재 객체의 ID가 obj로 참조되는 객체의 ID와 같은지를 확인합니다. 단, 이는 두 객체가 모두 Person 타입이고 id 속성을 가지고 있다고 가정합니다

*/







