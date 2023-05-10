package T230510;
/* 실수의 절댓값과 제곱근을 구하며 값의 반지름인 원의 넓이를 구하는 코드
 * 
 * 230510
 */
import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class MathMethods {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(in);
		out.print("실   수: ");
		double x = stdIn.nextDouble();
		
		out.println("절댓값: " + abs(x));
		out.println("제곱근: " + sqrt(x));
		out.println("넓 이: " + PI*x*x);
		
	}
}
