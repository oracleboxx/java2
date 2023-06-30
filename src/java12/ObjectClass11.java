package java12;





public class ObjectClass11 {
public static void main(String[] args) {
	String s ="Hello";
	char c =s.charAt(2);
	System.out.println(c);
	
	String pwd01 = "5678";
	if(pwd01.equals("5678")) {
		System.out.println("비번이 같다.");
	}
	else {
		System.out.println("다르다");
	}
	
	int idx =s.lastIndexOf('o');
	System.out.println(idx);
	System.out.println("\'hello\'의 문자길이는 "+s.length());// 단일 문자 o를 맨 왼쪽에서부터 찾아서 
	//가장 먼저 나오는 해당 문자 위치번호를 첫문자를 0부터 시작해서 o문자 위치번호를 반환
	
	String s2= s.replace("Hello", "Cello");//H문자를 C로변경
	System.out.println(s2); //Cello
	
	String fullName = "Hello.java";
	String fullname = fullName.substring(0, 5);
	System.out.println(fullname);
	String file =fullName.substring(6, 10);
	System.out.println(file);
}
}
