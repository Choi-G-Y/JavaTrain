package T230420;
/* 3개의 정숫값을 읽어서 실수(잘못한 일 아님 진짜 수임)로 평균을 표기하는 경우(잘못된 버전)
 * 
 * 230420
 */
import java.util.Scanner;

public class T_Avg3Wrong {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 x, y, z의 평균을 구합니다");
		System.out.print("x값: "); int x =stdIn.nextInt();
		System.out.print("y값: "); int y =stdIn.nextInt();
		System.out.print("z값: "); int z =stdIn.nextInt();
		
		double ave = (x + y + z) / 3;
		System.out.printf("x, y, z의 평균은 %.3f입니다.\n", ave);
	}

}
