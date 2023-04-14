package T230414;

import java.util.Scanner;

public class T_CountDown05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int a;
		do {
			System.out.print("양의 정숫값");
			a = stdIn.nextInt();
			
		}while (a <= 0);
//		do문 종료 시 x는 반드시 양의 값이 된다.
		
		while (a >= 0)
			System.out.println(a--);
		System.out.println("a의 값이" + a + "이 됐습니다.");
	}

}
