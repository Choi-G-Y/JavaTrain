package T230509;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class Day_ver2 {
	private int year =1;
	private int month = 1;
	private int date = 1;
	
	
//	각 월의 일수
	private static int [][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//평년
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},//윤년	
	};
	
	
	
	
//	y년은 윤년인가?
	private static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 !=0 || y % 400 == 0;
		
	}
//	y년m월의 일수 (28/29/30/31)
	private static int dayOfMonth(int y, int m) {
		return mdays[isLeap(y) ? 1 : 0][m - 1];
	}
	
//	조정된 m월(1~12 범위 외의 값을 조정)
	private static int adjustedMonth(int m) {
		return m < 1 ? 1 : m > 12 ? 12 : m;
	}
//	조정된 y년m월의 d일(1~28 29 30 31 범위 외의 값을 조정)
	private static int adjustedDay(int y, int m, int d) {
		if (d < 1)
			return 1;
		int dMax = dayOfMonth(y, m);
		return d > dMax ? dMax : d;
		
	}
	
//	생정자 오늘날짜
	public Day_ver2() {
		GregorianCalendar today = new GregorianCalendar();
	this.year = today.get(YEAR);
	this.month = today.get(MONTH) +1;
	this.date = today.get(DATE);
}
//	생성자 year년1월1일
	public Day_ver2(int year) {
		this.year = year;
		
	}
//	year년month월1일
	public Day_ver2(int year, int month) {
		this(year);
		this.month = adjustedMonth(month);
		
	}
//	year년month월date일
	public Day_ver2(int year, int month, int date) {
		this(year, month);
		this.date = adjustedDay(year, month, date);
	}
	
//	생성자(d와 같은 날짜)
	public Day_ver2(Day_ver2 d) {
		this(d.year, d.month, d.date);
	}
//	년 가져오기
	public int getYear() {
		return year;
		
	}
//	월 가져오기
	public int getMonth() {
		return month;
		
	}
//	일 가져오기
	public int getDate() {
		return date;
	}
//	연 설정
	public void setYear(int year) {
		this.year = year;
		this.date = adjustedDay(year, month, date);
		
	}
	
//	월설정
	public void setMonth(int month) {
		this.month = adjustedMonth(month);
		this.date = adjustedDay(year, this.month, date);
	}
//	일 설정
	public void setDate(int date) {
		this.date = adjustedDay(year, month, date);
	}
//	연, 월, 일 설정
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = adjustedMonth(month);
		this.date = adjustedDay(year, this.month, date);
		
	}
//	윤년이냐
	public boolean isLeap() {
		return isLeap(year);
	}
//	요일 구하기
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
		
		
	}
	
	public boolean equalTo(Day_ver2 d) {
		return year == d.year && month == d.month && date == d.date;
	}
//	문자열 표현 반환
	public String toString() {
		String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
		return String.format("%04d년%02d월%02d일(%s)", year, month, date, wd[dayOfWeek()]);
	}
//	연내 경과 일수
	public int dayOfYear() {
		int days = date;
		for (int i = 1; i < month; i++)
		days += dayOfMonth(year, i);
		return days;
	}
//	연내 잔여 일수
	public int leftDayOfYear() {
		return 365 + (isLeap(year) ? 1 : 0) - dayOfYear();
		
	}
//	날짜 d와의 전후 관계
	public int compareTo(Day_ver2 d) {
		return compare(this, d);
		
	}
	
//	두 날짜의 전후 관계
	public static int compare(Day_ver2 d1, Day_ver2 d2) {
//		연이 다르다
		if (d1.year > d2.year) return 1;
		if (d1.year < d2.year) return -1;

//		연이 같다
		
//		월이 다르다
		if (d1.month > d2.month) return 1;
		if (d1.month < d2.month) return -1;
		
		
		return d1.date > d2.date ? 1 : d1.date < d2.date ? -1 : 0;
		
	}
	
//	날짜를 하루 뒤로 변경
	public void succeed() {
		if (date < dayOfMonth(year, month))
			date++;
		else {
			if (++month > 12) {
				year++;
				month = 1;
				
			}
			date =1;
			
		}
	}
//	하루 뒤 날짜를 반환
	public Day_ver2 succeedingDay() {
		Day_ver2 temp = new Day_ver2(this);
		temp.succeed();
		return temp;
	}
//	날짜를 하루 앞으로 변경
	public void precede() {
		if (date > 1)
			date--;
		else {
			if (--month < 1) {
				year--;
				month =12;
				
			}
			
			date = dayOfMonth(year, month);
			
			
		}
	}
//	하루 앞 날짜를 반환
	public Day_ver2 precedingDay() {
		Day_ver2 temp = new Day_ver2(this);
		temp.precede();
		return temp;
	}
	
//	날짜를 n일 뒤로 변경
	public void succeedDays(int n) {
		if (n < 0)
			precedeDays(-n);
		else if (n >0) {
			date += n;
			while (date > dayOfMonth(year, month)) {
				date -= dayOfMonth(year, month);
				if(++month > 12) {
					year++;
					month = 1;
					
				}
			}
		}
	}
	
//	n일 뒤의 날짜를 반환
	public Day_ver2 after(int n) {
		Day_ver2 temp = new Day_ver2(this);
		temp.succeedDays(n);
		return temp;
		
	}

//	날짜를 n일 앞으로 변경
	public void precedeDays(int n) {
		if (n < 0)
			succeedDays(-n);
		
		else if (n < 0) {
			date -= n;
			while (date < 1) {
				if (--month < 1) {
					year--;
					month = 12;
					
				}
				date += dayOfMonth(year, month);
				
			}
		}
	}
	
//	n일 앞의 날짜를 반환
	public Day_ver2 before(int n) {
		Day_ver2 temp = new Day_ver2(this);
		temp.precedeDays(n);
		return temp;
	}
	
}
