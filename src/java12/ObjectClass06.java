package java12;
/*java.lang 기본 패키지의 StringBuffer 내장 api클래스 특징)
 * String 클래스하고는 다르게 StringBuffer 내장 api는 자기 자신의 값이 변경될 수 있다는 것이다
 * 
 */
public class ObjectClass06 {

	public static void main(String[] args) {
  StringBuffer str01 =new StringBuffer();
  str01.append("java");
  System.out.println(str01.toString());
  str01.append(" programming");//기존 내용을 유지한채 해당 문자 끝에 새로운 내용 추가
  System.out.println("변경된 str01"+str01.toString());// 문자열로 반환해서 출력
  
  str01.replace(0, 4, "MFC");//0이상 4미만 사이의 문자를 MFC로 변경
  System.out.println("변경된 str01:"+str01.toString());
  
  String str02 = str01.substring(3); //첫문자를 0부터 카운터해서 3이후부터 마지막 문자까지 반환
  System.out.println(str02);
  
  str01.deleteCharAt(0); // 0번째 위치 즉 첫 한문자를 지운다
  System.out.println(str01.toString());
  
  str01.reverse(); // 문자가 역순으로 배치
  System.out.println(str01.toString());
	}

}
