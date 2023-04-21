package TT230419;

import java.util.Random;
import java.util.Scanner;

/* 숫자 맞추기 게임 - 범위를 0~99로 변경, 플레이어 입력횟수 제한
 * 제한 횟수내에 맞추지 못하면 Out!
 * 230419
 */
public class T_FindRandomNum {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		final int MAX_NO = 6; //최대 입력 횟수
		int leftNO = MAX_NO;	// 남은 횟수
		int no = rand.nextInt(100);	//숫자의 범위
		
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		
		int x;
		do {
			System.out.println("남은 횟수 " + (leftNO--) + "회, 어떤 숫자일까?: ");
			x = stdIn.nextInt();
			
			if (x > no)
				System.out.println("더 작은 숫자입니다.");
			else if (x < no)
				System.out.println("더 큰 숫자입니다.");
		} while (x != no && leftNO > 0);
		
		if (x == no)
			System.out.print((MAX_NO - leftNO) + "회만에 맞추었습니다.");
		else
			System.out.println("아쉽네요. 정답은 "+ no + "입니다.");
	}

}
