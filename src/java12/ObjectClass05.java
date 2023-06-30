package java12;

/* java.lang패키지의 final class인 문자열을 다루는 내장 api String 클래스 특징
 *  문자열 String은 자기 자신 내용을 수정 못한다. 문자열 내용이 수정되면 새로운 무자열 객체가 생성된다.
 *  
 * 
 */
import java.lang.*;

public class ObjectClass05 {

	public static void main(String[] args) {
		String str = "str".toUpperCase();
	
		System.out.println(str);
		String str02 = new String(" Programing");
		System.out.println("\'Programing\' 문자길이"+str02.length());
		
		String result = str.concat(str02);
		System.out.println(result); // 문자열 연결하는 concat
		
		System.out.println(result.charAt(2));
		//charAt()내장 메서드는 주어진 인자값 2에 해당하는 단일문자를 구함
		// 첫문자를 0부터 카운터한다.
		
		System.out.println(str02.indexOf('r')); 
		//index()내장 메서드는 단일문자 r을 맨왼쪽에서부터 찾아서 가장 먼저 나오는 해당 문자 위치번호를 0
		//부터 카운터 해서 반환=>3s
		System.out.println((str02.lastIndexOf('r')+1));
	}

}
