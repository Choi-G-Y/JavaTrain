package T_230425Ex;
/* 4개의 계산 문제중 하나를 무작위로 출시해 암산에 도움을 주는 코드
 * 
 * 230425
 */

import java.util.Random;
import java.util.Scanner;

class T_MentalArithmetic {
	static Scanner stdIn = new Scanner(System.in);
	
	
//	계속할지 확인
	static boolean confirmRetry() {
		int cont; do {
			System.out.print("다시 한번? Yes 1 / No 0>:");
			cont = stdIn.nextInt();
		}while (cont != 0 && cont != 1);
		return cont ==1;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("암산 훈련!!!");
		
		
		do {
			int x =rand.nextInt(900) + 100;
			int y =rand.nextInt(900) + 100;
			int z =rand.nextInt(900) + 100;
			int pattern = rand.nextInt(4);
			
			int answer;
			switch (pattern) {
			case 0: answer = x + y + z; break;
			case 1: answer = x + y - z; break;
			case 2: answer = x - y + z; break;
			default: answer = x - y - z; break;
			
			}
			while (true) {
				System.out.print(x + ((pattern < 2) ? " + " : " - ") + 
						y + ((pattern % 2 == 0) ? " + " : " - ") + 
						z + " - ");
				
				int k = stdIn.nextInt();
				if (k == answer)
					break;
				System.out.println("틀렸습니다");
						 
			}
		}while (confirmRetry());
	}
}
