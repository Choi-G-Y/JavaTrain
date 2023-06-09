package T230427;
/* 두 배열의 전체 요솟값을 교환하는 코드
 * 
 * 230427
 */
import java.util.Scanner;

public class AryExchng {
	
	static void arExchng(int[] a, int[] b) {
		int n = a.length < b.length ? a.length : b.length;
		for (int i = 0; i < n; i++) {
			int t = a[i]; a[i] = b[i]; b[i] = t;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 a의 요소 수: ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		for (int i = 0; i < na; i++) {
			System.out.print("a [" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		System.out.print("배열 b의 요소 수:");
		int nb = stdIn.nextInt();
		int[] b = new int[nb];
		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}
		
		arExchng(a, b);
		System.out.println("배열 a와 b의 전체요소를 교환했습니다.");
		for (int i = 0; i < na; i++)
			System.out.println("a[" + i + "] = " + a[i]);
			
			for (int i = 0; i <nb; i++)
				System.out.println("b[b" + i + "] = " + b[i]);
	}
	
	
	
	
	
	
}
