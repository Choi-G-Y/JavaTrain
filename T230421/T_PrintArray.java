package T230421;
/* 배열의 모든요소에 값을 읽어서 초깃값 형식으로 표시
 * 
 * 230421
 */
import java.util.Scanner;

public class T_PrintArray {
	public static void main(String[] args) {
		
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("요소 수: ");
	int n = stdIn.nextInt();
	int[] a = new int[n];
	
	
	for (int i = 0; i < n; i++) {
	System.out.print("a[" +i+ "] = ");
	a[i] = stdIn.nextInt();
	
	}
	System.out.print("a = {");
	if ( n>= 2)
		for (int i = 0; i < n - 1; i++)
			System.out.print(a[i]+ ", ");
	if (n >= 1)
		System.out.print(a[n - 1]);
	System.out.print("}");
	}
}
