package java12;

public class ObjectClass12 {

	public static void main(String[] args) {
		String animals = "dog cat bear";
		String[] arr =animals.split(" ");
		for(String animal:arr) {
			System.out.println(animal);
		}
		System.out.println("==============");
		String str ="java.lang.Object";
		String c= str.substring(10);//첫문자를 0부터 시작해서 10이후부터 마지막 문자까지 Object를 반환
		System.out.println(c);
		
		String p= str.substring(5,9); // 첫문자를 0부터 시작해서 5이상 9미만 사이의 문자 반환=> lang
		System.out.println(p);
	}

}
