package T230424;

import java.util.Random;
import java.util.Scanner;

public class T_daycai2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayKorean = { "일", "월", "화", "수", "목",
				"금", "토" };
		String[] dayEnglish = { "sunday", "monday", "tuesday", "wednesday",
				"thursday", "friday", "saturday"};
		
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		
		int retry;
		int last = -1;
		
		do {
			int day;
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;
			
			int action;
			do {
				System.out.print(dayKorean[day] + "요일 : ");
				String s = stdIn.next();
				
				if (s.equals(dayEnglish[day])) {
					System.out.println("정답입니다.");
					break;
				}
				System.out.println("틀렸습니다.");
				do {
					System.out.print("재입력1 / 정답보기0");
					action = stdIn.nextInt();
				} while (action !=0 && action != 1);
				if (action==0)
					System.out.println(dayKorean[day]+ "요일은\"" + dayEnglish[day] + "\"입니다.");
				
			}while (action == 1);
			System.out.println("다시1/ 그만 0");
			retry = stdIn.nextInt();
		}while (retry == 1);
	}

}
