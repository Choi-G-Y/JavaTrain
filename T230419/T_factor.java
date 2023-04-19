package T230419;

import java.util.Scanner;

public class T_factor {
/*최대공약수를 구하는 코드
 * 230419
 */
	public static int funtion(int a, int b, int c) {
		int min = 0;
		if (a > b) {
			if(b >c) {
				min = c;
			}
			else {
				min = b;
			} 
		} else {
			if(a > c) {
				min = c;
		} else {
			min = a;
		}
	}
	for(int i = min; i > 0; i--) {
		if(a % i ==0 && b % i == 0 && c % 1 == 0) {
			return i;
		}

	}
	return -1;

}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 정수를 입력하시오. :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("최대 공약수: " + funtion(a, b, c));
	}
}