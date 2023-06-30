package java12;
/* String 클래스 하위의 내장 메서드를 활용해서 주어진 파일로부터 파일명과 확장자를 구하는 예제)
 * 
 * 
 */
public class ObjectClass13 {
 public static void main(String[] args) {
	String fullName= "Hello.java";
	int index =fullName.lastIndexOf('j');
	System.out.println(index);
}
}
