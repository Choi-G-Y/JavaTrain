package T230420;
/* 전의 OctHex와 다를게 없다 코드만 바뀌었을뿐
 * 8, 16진수로 바꿔주는 코드
 * 230420
 */
import java.util.Scanner;

public class T_0ctHex1Line {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수: ");
		int x = stdIn.nextInt();
		
		System.out.printf("8진수는 %o이고 16진수는 %x입니다.\n", x, x);
	}

}
