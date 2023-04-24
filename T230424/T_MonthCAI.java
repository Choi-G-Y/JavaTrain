package T230424;

import java.util.Random;
import java.util.Scanner;

/* 1~12월을 숫자료 표시하고 해당월의 영단어 입력
 * 
 * 230424
 */
public class T_MonthCAI {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
				"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"Aug", "Sep", "Oct", "Nov", "Dec"
		};
		
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
		
		int retry;
		int last = -1;
		
		do {
			int month;
			do {
			month = rand.nextInt(12);
			
		} while (month == last);
		last = month;
		
		while (true) {
			System.out.print((month +1) + "월: ");
			String s = stdIn.next();
			
			if (s.equals(monthString[month])) break;
			System.out.println("틀렸습니다.");
		}
		System.out.print("정답입니다. 다시한번? 1.. yes/0.. no");
		retry = stdIn.nextInt();
	}while (retry == 1);

}
}