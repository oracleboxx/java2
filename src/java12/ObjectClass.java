package java12;

/* java.lang 패키지의 최고 조상 클래스 Object의 내장 메서드 중
 * toString()메서드를 자손에서 오버라이딩을 해서 활용하는 예제)
 * 
 * 
 */
import java.lang.*; // 생략가능
class Point01 extends ObjectClass13{
	 private int x ;
	 private int y ;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void Point01() {
		
	}
public  void Point01(int x , int y){
		this.x = x;
		this.y = y;
	}
@Override
public String toString() {
	
	return "(x좌표값="+x+",y좌표값="+y+")";
}
	
}


public class ObjectClass {

	public static void main(String[] args) {
		
		Point01 p1 = new Point01();
	p1.setX(2);
	p1.setY(40);
	}

}
