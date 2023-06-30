package java12;

import java.util.StringTokenizer;

/* java.util패키지의 StringTokenizer 내장 api클래스 특징
 * 어떤 특수문자기호를 기준으로 문자를 분리 즉 파싱해 준다. 분리된 문자를
 * 파싱된 문자라고 한다.
 * 파싱된 문자는 딱 한번만 사용가능.
 * 
 * 
 */

public class ObjectClass07 {

	public static void main(String[] args) {
		String phone = "010-1111-2222";
		StringTokenizer st = new StringTokenizer(phone,"-");//-를 기준으로 폰번호를 분리한다.
		int count =st.countTokens();// 파생된 문자 즉 분리된 문자 개수
		System.out.println(count);
		while(st.hasMoreTokens()) { // 분리된 토큰이 있다면 참
			System.out.println(st.nextToken());//분리된 폰번호를 반환한다.
		}
		System.out.println("===============");
		StringTokenizer st02 = new StringTokenizer(phone,"-");	
		System.out.println(st02.nextToken());
		System.out.println(st02.nextToken());
		System.out.println(st02.nextToken());
		
		
	}

}
