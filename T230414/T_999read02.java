package T230414;

import java.util.Scanner;

/* 20230414
 * 3자리의 양의 정숫값(100~999)까지 읽는 프로그램 작성
 */
public class T_999read02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int x;	//읽는 값
		do {
			System.out.print("세 자리의 정숫값:");
			x = stdIn.nextInt();
			
		}while (x < 100 || x >999);
		System.out.println("입력한 값은 " + x + "입니다.");
	}

}
