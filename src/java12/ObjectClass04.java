package java12;

/* 자바 기본타입 8개 예약어를 포장해서 클래스화 한 것을 래퍼(wrapper) 클래스라고한다
 * 
 * 래퍼 클래스 종류)
 * 기본타입 래퍼클래스 
 * byte 	Byte
 * short 	Short
 * char 	Character
 * int 		Integer
 * long 	Long
 * float 	Float
 * double 	double
 * boolean 	Boolean
 * 
 * 오토박싱 : 기본 타입을 참조 래퍼 타입으로 자동형 변환을 해주는 것을 말한다.
 * 오토 언박싱 : 참조 래퍼타입을 기본타입으로 자동형 변환을 해주는 것을 말한다
 * 오토바싱과 오토 언박싱 문법은 jdk 1.5이후에 추가된 문법으로 적용 가능하다.
 * 
 * 
 */
public class ObjectClass04 {

	public static void main(String[] args) {
             int n01 = 10;
             int n02;
             Integer num01;
             Integer num02= new Integer(20);
             double d1 ;
             double d2 = 1.1;
             @SuppressWarnings("deprecation")
			Double dd1 = new Double(2.2);
             Double dd2 ;
             d1 = dd1;
             System.out.println(d1);
             num01 = n01;//오토박싱
             System.out.println(num01);
             n02 = num02 ;// 오토 언 박싱
             System.out.println(n02);
	}

}
