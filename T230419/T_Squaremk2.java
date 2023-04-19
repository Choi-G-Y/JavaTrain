package T230419;
/* 기호문자 *를 나열해서 n단의 정방형을 표시하는 코드
 * 230419
 */
import java.util.Scanner;

public class T_Squaremk2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정방형을 표시함.");
		System.out.print("단수는: ");
		int n = stdIn.nextInt();
		
		for (int i=1; i <= n; i++) {
			for (int j=1; j <= n;j++)
				System.out.print('*');
			System.out.println();
				
		}
		
		
	}

}
