package T230419;

import java.util.Scanner;

/* *기호로 왼쪽아래가 직각인 이등변 삼격형을 만드는코드 주석으로 달아준
 * 코드를 본 코드와 바꾸면 왼쪽위가 직각인 이등변 삼각형을 만드는 코드가 된다
 * 230419
 */
public class T_IsoscelesTriangle {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
//		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는?");
		int n = stdIn.nextInt();
		
		for (int i=1; i <= n; i++) {
			for(int j=1; j <=i; j++)
//			for(int j=1; j <= n-i+1; j++) *기호가 위서부터 시작하게 만드는 코드
				System.out.print('*');
			System.out.println();
		}
	}

}
