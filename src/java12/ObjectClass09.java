package java12;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* java.util 패키지의 GregorianCalender
 * 
 */
public class ObjectClass09 {
	
	public static void main(String[] args) {
		
		GregorianCalendar gcal = new GregorianCalendar();
		int year = gcal.get(Calendar.YEAR);
		int month = gcal.get(Calendar.MONTH)+1;
		int date =gcal.get(Calendar.DATE);
		System.out.println(year+"년"+month+"월"+date+"일");
		System.out.println(year+"년은");
		if(gcal.isLeapYear(year)) {
			System.out.println("윤년입니다");
		}
		else {
			System.out.println("윤년이 아닙니다");
		}
	}

}
