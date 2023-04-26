package T230426;

import java.util.Scanner;

/* 정수 x의 pos번쨍 있는 비트를 1로 변경함 값을 set메서드, 0은 reset메서드 해당위치 반전의
 * inverse로 반환하는 코드
 * 230426
 */
public class T_SetBit {
	static void printBits(int x) {
		for (int i = 31; i >=0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	static int set(int x, int pos) {
		return x | (1 << pos);
	}
	
	static int reset(int x, int pos) {
		return x & ~(1 << pos);
	}
	
	
	static int inverse(int x, int pos) {
		return x ^ (1 << pos);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수x의 pos번쨰 비트를 변경합니다.");
		System.out.print("x: "); int x = stdIn.nextInt();
		System.out.print("pos: "); int pos = stdIn.nextInt();
		
		System.out.print("x                          = "); printBits(x);
		System.out.print("\nset(x, pos)              = "); printBits(set(x, pos));
		System.out.print("x\nreset(x, pos)           = "); printBits(reset(x, pos));
		System.out.print("x \ninverse(x, pos)        = "); printBits(inverse(x, pos));
		System.out.println();
	}
	
	
}
