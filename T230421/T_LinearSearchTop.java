package T230421;
/* 배열에서 특정값을 가진 요소를 찾는 코드 만약 동일값이 있을시 가장 앞에
 * 위치한 요소와 가장 뒤에 있는 요소를 찾아준다.
 * 230421
 */
import java.util.Scanner;

public class T_LinearSearchTop {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		
		for (int j = 0; j < n; j++) {
			System.out.print("a[" + j + "] = ");
			a[j] = stdIn.nextInt();
		}
		
		System.out.print("찾을 숫자:");
		int key = stdIn.nextInt();
		
		int i;
		for (i = 0; i < n; i++)
			if (a[i] == key)
				break;
		
		if (i < n)
			System.out.println("그 값은 a[" + i + "]에 있습니다.");
		else
			System.out.println("해당 값이 존재하지 않습니다.");
	}

}
