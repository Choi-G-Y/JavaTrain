package T230424;
/* 배열의 요소를 1~10까지 난수로 채우지만 인접요소가 중복되지 않게 하는 코드
 * 
 * 230424
 */
import java.util.Random;
import java.util.Scanner;

public class T_ArrayRandX {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.print("요소 수 : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		a[0] = 1 + rand.nextInt(10);
		
		for (int i =1; i < n; i++) {
			do {
				a[i] = 1 + rand.nextInt(10);
				
			} while(a[i]==a[i-1]);
		}
		
		for (int i= 0; i < n; i++)
			System.out.println("a[" + i + "] = "+ a[i]);
	}

}
