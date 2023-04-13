package T230413;
//2개의 정숫값을 읽어 두 값의 차를 표시하는 코드
import java.util.Scanner;
public class Test02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 a:");
			int a = stdIn.nextInt();
		System.out.println("정수 b:");
			int b = stdIn.nextInt();
			
		
		int diff;
		if (a >= b)
			diff = a - b;
		else
			diff = b - a;
		
		System.out.println("두 값의 차는 " + diff + "입니다." );
		
	}

}
