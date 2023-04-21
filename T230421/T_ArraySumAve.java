package T230421;
/* 모든 요소의 함과 평균을 구해서 표시(확장에 for문을 사용)
 * 
 * 230421
 */
import java.util.Scanner;

public class T_ArraySumAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수: ");
		
		int n = stdIn.nextInt();
		double[] a = new double[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" +i+ "] = ");
			a[i] = stdIn.nextDouble();
			
		}
		double sum = 0;
		for (double i : a)
			sum += i;
		
		System.out.println("모든 요소의 합은" + sum + "입니다.");
		System.out.println("모든 요소의 평균은" + sum / n + "입니다.");
		
	}

}
