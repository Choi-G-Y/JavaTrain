package T230419;

import java.util.Scanner;

/* 합계와 평균을 구하는 코드 mk.2
 * 하지만 이번에는 정숫값 한계가 1,000이내에서 이루어질것
 * 230419
 */
public class T_SumBreak2ave {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		System.out.println("몇 개를 더할까요?: ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i;
		for (i =0; i < n; i++) {
			System.out.print("정수: ");
			int t =stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("합계가 1000을 넘었습니다");
				System.out.println("마지막 값은 무시합니다.");
				break;
			
			}
			sum += t;
		}
		System.out.println("합계는 " + sum + "입니다.");
		if (i != 0)
			System.out.println("평균은 " + sum / i + "입니다.");
		
	}

}
