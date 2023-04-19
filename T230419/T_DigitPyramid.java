package T230419;

import java.util.Scanner;

/* 좀더 큰 피라미드
 * 조건은 i번째 행에는 i%10을 표시할것
 * 230419
 */
public class T_DigitPyramid {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자 피라미드를 표시함");
		System.out.println("단수는: ");
		int n = stdIn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
			System.out.print(' ');
			for (int j = 1; j <= 2 * i - 1; j++)
			System.out.print(i % 10);
			System.out.println();
		}
		
	}

}
