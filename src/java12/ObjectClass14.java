package java12;
/* 자기 자신 문자 내용을 변경가능한 StringBuffer 내장 api 
 * 
 */


public class ObjectClass14 {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("abc");
		StringBuffer sb2 =new StringBuffer("abc");
		
		
		System.out.println(sb.equals(sb2));
		
		
		
		if(sb.toString().equals(sb2.toString())) {
		    System.out.println("true");	
		}
		else {
			System.out.println("false");
		}

	}

}
