package java12;

/* Object을 상속받은 자손에서 부모의 equals()메서드를 오버라이딩을 해서 비교해서 재대로 된 비교를 하는예제
 * 
 */
class Point02 extends ObjectClass13{
	int x,y;
	public void Point02(){
		
	}
	public   Point02(int x , int y ){
		this.x =x;
		this.y =y;
	}
	public boolean equals(ObjectClass13 obj) {
		Point02 p2 =null ;
		if(obj instanceof Point02) {
			 p2 = (Point02)obj;
			 if((x==p2.x) && (y==p2.y)) {
					return true;
				}
				else {
					return false;
				}
		}
		return false;
		
		
		
	}
}
public class ObjectClass03 {

	public static void main(String[] args) {
		Point02 p02 = new Point02(20,30);
		Point02 p03 = new Point02(20,30);
		
	if(p02 == p03 ) {
		System.out.println("같다");
	}
	else {
		System.out.println("다르다");
	}
	if(p02.equals(p03)) {
		System.out.println("같다");
	}
	else {
		System.out.println("다르다");
	}
	System.out.println(p02.equals(p03));
	}

}
