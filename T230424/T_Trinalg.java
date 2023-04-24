package T230424;
/* 삼각형 넓이 구하기
 * 230424
 */
import java.util.Scanner;
public class T_Trinalg {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

		    System.out.println("삼각형의 밑변을 입력하세요: ");
		    double base = scanner.nextDouble();

		    System.out.println("삼각형의 높이를 입력하세요: ");
		    double height = scanner.nextDouble();

		    double area = base * height / 2;

		    System.out.println("삼각형의 넓이는 " + area + "입니다.");
		  }
		}