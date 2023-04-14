package T230414;
/*입력된 정숫값의 부호를 판정해서 표시(원하는 만큼 반복)
 * 2023 04 14
 * Do를 이용한 반복문
 */
import java.util.Scanner;

public class T_Do01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int retry; // 다시
		
//do문에 의해 반복되는 루프 바디
	do {
		System.out.print("정숫값:");
		int n = stdIn.nextInt();
		
		if (n > 0)
			System.out.println("이 값은 양수입니다.");
		else if (n < 0)
			System.out.println("이 값은 음수입니다.");
		else
			System.out.println("이 값은 0입니다.");
		
		System.out.print("다시 한번? 1-Yes / 0-No");
		retry = stdIn.nextInt();
	}while (retry==1);
	}

}
