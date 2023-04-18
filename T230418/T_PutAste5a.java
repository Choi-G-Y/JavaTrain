package T230418;

import java.util.Scanner;

/*5개 단위로 줄이 바뀜
 * 230418
 */
public class T_PutAste5a {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?: ");
		int n= stdIn.nextInt();
		
		if (n > 0) {
			for(int i=0; i < n; i++) {
				System.out.print("*");
				if ( i%5 == 4)
					System.out.println();
				
			}
			if (n%5 !=0)
				System.out.println();
		}
	}

}
