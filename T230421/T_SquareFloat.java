package T230421;
/* 0.0부터 1.0까지 0.001단위로 증가시키며 제곱표시
 * (float로 제어)
 * 230421
 */
public class T_SquareFloat {

	public static void main(String[] args) {
		System.out.println("x    x의 제곱");
		System.out.println("-----------");
		
		for (float x = 0.0F; x <= 1.0F; x += 0.001F)
			System.out.printf("%5.3f  %10.7f\n", x, x * x);
	}

}
