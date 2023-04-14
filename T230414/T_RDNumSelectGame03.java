package T230414;
/* 랜덤과 스캐너를 이용해서 난수 (10~99)사이의 수를
 * 맞추는게임을 만드는것
 * 20230414
 */
import java.util.Random;
import java.util.Scanner;

public class T_RDNumSelectGame03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rand = new Random();
Scanner stdIn = new Scanner(System.in);
int no = 10 + rand.nextInt(90);
//맞춰야하는 숫자를 10~99의 난수를 생성 수의 범위를 바꾸기 원한다면 12행의 수를 바꿔야함
System.out.println("숫자 맞추기 게임 시작");
System.out.println("10부터 99사이의 숫자를 맞추세요.");

int x;
do {
	System.out.print("어떤 숫자일까?");
	x = stdIn.nextInt();
	
	if (x > no)
		System.out.println("더 작은 숫자입니다");
	else if (x < no)
		System.out.println("더 큰 숫자입니다.");
//	정답이 아니면 알려준다
}while (x != no);
System.out.println("정답입니다.");

	}

}
