package T230424;

import java.util.Random;
import java.util.Scanner;

public class T_DayCAImk1 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayKorean = {"월", "화", "수", "목", "금", "토", "일"};
		String[] dayEnglish = {"Sunday", "Monday", "Tuseday", "Wednesday", 
				"Thursday", "Friday", "Saturday"};
		
		System.out.println("요일명을 영어로 입력하시오.");
		
		int retry;
		int last = -1;
		
		
		do {
			int day;
			do {
				day = rand.nextInt(7);
				
			} while (day == last);
			last = day;
			
			while (true) {
				System.out.print(dayKorean[day]+ "요일 :");
				String s = stdIn.next();
				
				if (s.equals(dayEnglish[day])) break;
				System.out.println("틀렸습니다.");
			}
			System.out.println("정답입니다. 다시 한번? 1yes/0no");
			retry = stdIn.nextInt();
			
		}while (retry == 1);
	}

}
