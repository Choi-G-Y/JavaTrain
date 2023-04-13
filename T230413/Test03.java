package T230413;

import java.util.Scanner;

//입력한 3개의 정숫값중 중앙값을 구해주는 프로그램 코드
public class Test03 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수 a:");
		System.out.print("정수 b:");
		System.out.print("정수 c:");

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();

		int med;
		if (a >= b)
			if (b >= c)
				med = b;

			else if (a <= c)
				med = a;
			else
				med = c;

		else if (a > c)
			med = a;
		else if (b > c)
			med = c;
		else
			med = b;

		System.out.println("중앙값은 " + med + "입니다.");

	}

}
