package T_230425Ex;

import java.util.Scanner;

/* 입력한 정수의 부호를 판정하는 코드
 * 
 * 230425
 */
public class T_Signof1 {
//n의 부호 판정
	static int sign0f(int n) {
		int sign = 0;
		
		if (n > 0)
			sign = 1;
		else if (n < 0)
			sign = -1;
		
		return sign;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 x: ");
		int x = stdIn.nextInt();
		
		int s = sign0f(x);
		System.out.println("sign0f(x)는 " + s + "입니다.");
	}

}


