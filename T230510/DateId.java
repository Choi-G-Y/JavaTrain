package T230510;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;
public class DateId {
//	몇번까지 식별번호를 부여했는가
	private static int counter;
	private int id;
	
	static {
		GregorianCalendar today = new GregorianCalendar();
		int y= today.get(YEAR);
		int m= today.get(MONTH) +1;
		int d= today.get(DATE);
		
		
		System.out.printf("오늘은 %04d년 %02d월 %02d일 입니다.\n", y, m, d);
		
		counter = y * 100000+m*10000 +d *100;
		
	}
	
//	생성자
	public DateId() {
		id = ++counter;
		
		
	}
	public int getId() {
		return id;
	}
	
}
