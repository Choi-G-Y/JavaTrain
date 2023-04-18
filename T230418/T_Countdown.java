package T230418;

import java.util.Scanner;

/*230418
 * 카운트다운시작!
 */
public class T_Countdown {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트 다운 시작.");
		int x;
		do {
			System.out.println("양의 정숫값: ");
			x = stdIn.nextInt();
			
		} while (x <= 0);
		
		for (; x >= 0 ; x--)
			System.out.println(x);
	}

}
