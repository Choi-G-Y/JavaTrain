package T230419;

import java.util.Scanner;

/* 정숫값을 연달아 읽어서 음수가 아닌값의 평균, 합계구하기
 * 단 음수의 개수는 평균을 구할때 제외
 * 230419
 */
public class T_SumContinueAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 더합니다.");
		System.out.print("몇 개를 더할까요?");
		int n = stdIn.nextInt();
		int sum = 0;
		int count = 0;
		int i;
		
		for (i = 0; i < n; i++) {
			System.out.print("정수: ");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			}
			sum += t;
			count++;
		}
		System.out.println("합계는 " + sum + "입니다.");
		if (i != 0)
			System.out.println("평균은 " + sum / count + "입니다.");
	}

}
