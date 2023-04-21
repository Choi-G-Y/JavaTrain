package T230420;
/* 정수를 입력할시 8진수와 16진수로 바꿔주는 코드
 * 
 * 230420
 */
import java.util.Scanner;

public class T_0ctHex {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수: ");
		int x = stdIn.nextInt();
		
		
		System.out.printf(" 8진수는 %o입니다.\n", x);
		System.out.printf(" 16진수는 %x입니다.\n", x);
		
	}

}
