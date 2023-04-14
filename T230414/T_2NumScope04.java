package T230414;
/* 두 수를 정수 t를 이용하여 a가 크든 b가 크든 같은 결과를 냄
 * 두 수 사이의 정숫값을 큰순부터 표기하는 코드
 * 20230414
 */
import java.util.Scanner;

public class T_2NumScope04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 A:");
		System.out.print("정수 B:");
		
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		
		if (a > b) {	//a가 b보다 크면
			int t = a; //두 값을 교환
			a = b;
			b = t;
		}
		
		do {
			System.out.println(a + " ");
			a = a + 1;
		} while (a <= b);
		System.out.println();
		
	}

}
