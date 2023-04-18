package T230418;

import java.util.Scanner;

/* Sumup에서 좀더 업그레이드됨
 * 계산과정까지 보여주는
 * 230418
 */
public class T_Sumupmk2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n;
		do {
			System.out.print("n의 값: ");
			n = stdIn.nextInt();
			
		}
		while (n <= 0);
		int sum = 0;
		for (int i = 1; i < n; i++) {
			System.out.println(i + " + ");
			sum += i;
		}
		System.out.println(n + " = ");
		sum += n;
		System.out.println(sum);
	}

}
