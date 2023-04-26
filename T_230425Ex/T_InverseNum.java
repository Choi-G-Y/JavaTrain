package T_230425Ex;
/* 양의 정숫값을 읽어서 뒤에서부터 읽어서 표시하는 코드
 * 
 * 230425
 */
import java.util.Scanner;

public class T_InverseNum {
	static Scanner stdIn = new Scanner(System.in);
	
	static int readPlusInt() {
		int x;
		do {
			System.out.print("양의 정숫값: ");
			x= stdIn.nextInt();
			
		}while (x <= 0);
		return x;
	}
	
	public static void main(String[] args) {
		int x;
		do {
			int n = readPlusInt();
			
			System.out.print("반대로 읽으면 ");
			while (n > 0) {
				System.out.print(n%10);
				n /=10;
			}
			System.out.println("입니다.");
			do {
				System.out.print("다시 한번? Yes1/ NO 0>:");
				x= stdIn.nextInt();
			}while (x!=0 && x!=1);
		}while (x == 1);
	}
	
}
