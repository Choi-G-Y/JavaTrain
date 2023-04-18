package T230418;
/* 230418
 * 1부터n까지의 합 구하기
 * for문을 사용
 */
import java.util.Scanner;

public class T_SumUp {
public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	System.out.print("1부터 n까지의 합을 구합니다.");
	int n;
	do {
		System.out.println("n의 값: ");
		n = stdIn.nextInt();
		
	}
	while (n <= 0);
	
	int sum = 0;
	for (int i = 0; i <= n; i++)
		sum += i;
	System.out.println("1부터 " + n + "까지의 합은" + sum +"입니다.");
}
}
