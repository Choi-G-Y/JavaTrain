package T230419;
/* if else를 이용한 계절 찾기
 * 230419
 */
import java.util.Scanner;

public class T_SeasonReapeat {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		System.out.println("계절을 찾습니다.");
		
		do {
			int month; //월
		do {
			System.out.print("몇 월입니까?");
			month = stdIn.nextInt();
		}while (month < 1 || 
				month > 12);
		
		if (month >= 3 && month <= 5)
			System.out.println("봄임");
		else if (month >= 6 && month <=8)
			System.out.println("여름");
		else if (month >= 9 && month <= 11)
			System.out.println("가을");
		else if (month == 12 || month == 1 || month ==2)
			System.out.println("겨울");
		
		
		System.out.println("다시? 1..ㅇ / 0..ㄴ");
		retry = stdIn.nextInt();
		} while (retry == 1);
		
		
	}

}
