package T230414;

import java.util.Scanner;

/* 입력한 수 만큼 *가 표시되는 코드
 * 2023 0414
 */
public class T_LetsCountStars07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i = 0;
			while(i < n) {
				System.out.println('*');
				i++;
			}
			System.out.println();
		}
		

	}

}
