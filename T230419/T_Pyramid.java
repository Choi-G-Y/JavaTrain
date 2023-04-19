package T230419;

import java.util.Scanner;

/* n단 피라미드를 만드는 프로그램
 * 단 조건은 i행째에는 (i -1)* 2 + 1개의 '*'기호를 표기
 * 마지막행인 n행쨰에는 (n-1)*2+1의 *를 표시할것
 * 230419
 */
public class T_Pyramid {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는?: ");
		int n = stdIn.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-1; j++)
				System.out.print(' ');
			for (int j = 1; j <= 2*i-1; j++)
				System.out.print('*');
			System.out.println();
		}
		
		
	}

}
