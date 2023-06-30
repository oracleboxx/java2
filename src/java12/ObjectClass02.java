package java12;

/* String 문자열 내장 클래스에 오버라이딩 된 equals() 메서드와 자바 비교 연산자 중
 * 하나인 == 같다 연산의 활용과 차이점 => 프로젝트 개발할 때 자바 개발자들이 실수하는 부분이다.
 * 
 * 
 */


public class ObjectClass02 {

	public static void main(String[] args) {
		int a =10, b=10;
		if(a==b) {
			System.out.println("값이 같다");
		}
		else {
			System.out.println("틀리다");
		}
		String str =new String("1234");
		String str1 =new String("1234");
		if(str == str1 ) { //참조 타입에서 == 로 비교하면 무자열 내용값이
			//비교하는 것이 아니라 객체주소 비교한다. => 객체주소가 달라서 false 
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		if(str.equals(str1) ) { // String 참조 타입에서는 오버라이딩 된 equals()메서드로
			//비교하면 객체주소를 비교하는 것이 아니라 문자열 내용값만 비교한다 true
			System.out.println("같다");

		}
		else {
			System.out.println("다르다");
		}
	}

}
