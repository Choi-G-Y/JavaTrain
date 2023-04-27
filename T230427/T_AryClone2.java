package T230427;
/* 2차원 배열a의 복사본을 생성해서 변환하는 코드
 * 
 * 230427
 */
import java.util.Scanner;

public class T_AryClone2 {
	
	static int[][] aryClone2(int[][] a) {
		int[][] c = new int[a.length][];
		for (int i = 0; i<a.length; i++) {
			c[i] = new int[a[i].length];
			for (int j = 0; j < a[i].length; j++)
				c[i][j] = a[i][j];
		}
		return c;
	}
	
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("행렬의 행 수: "); int height =stdIn.nextInt();
		System.out.print("행렬의 열 수: "); int width =stdIn.nextInt();
		
		int[][] a = new int[height][width];
		for (int i = 0; i <a.length; i++) {
			for (int j = 0; j <a[i].length; j++) {
				System.out.printf("a[%d][%d]: ", i, j);
				a[i][j] = stdIn.nextInt();
			}
		}
		
		int[][] ca = aryClone2(a);
		System.out.println("행렬a");
		printMatrix(a);
		
		System.out.println("행렬 a의 복사본");
		printMatrix(ca);
		
	}
	
	
}
