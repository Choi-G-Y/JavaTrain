package T230413;
/* 두 정숫값의 차가 10이하인 경우 두 값의 차는 10이하입니다.
 라고 표시하고 그렇지 않으면 두값의 차는 11이상입니다 라는 코드
 */
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) 
		{
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:");
		int a = stdIn.nextInt();
		System.out.print("정수 b:");
		int b = stdIn.nextInt();
		
		int diff = a >= b ? a -b : b - a;
		
		if (diff <=10)
			System.out.println("두 값의 차는 10이하입니다.");
		else
			System.out.println("두 값의 차는 11이상입니다.");

			}
		}