package T230501;
/* Class 휴먼재료를 안들고와서 그런가 완성이 안된 코드 클래스만 있다면 돌아갈만하다고 본다.
 * 
 * 230501
 */
import java.util.Scanner;

public class HumanArrayTester {
//Human형 1차원 배열의 모든 요소를 표시
	static void printHumanArray(Human[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.printf("No.%d %s %3dcm %3dkg\n", i,
					a[i].getName(), a[i].getHeight(), a[i].getWeight());
		
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		
//		----1차원 배열-----
//		생성과 동시에 초기화
	Human[] p = {
			new Human("철수", 170, 70),
			new Human("길동", 160, 59)
	};
	
	System.out.print("배열 q의 요소 수: ");
	n = stdIn.nextInt();
	
	Human[] q = new Human[n];
	for (int i = 0; i < q.length; i++) {
	    System.out.println("q[" + i + "]");
	    System.out.print("이름: "); String name = stdIn.next();
	    System.out.print("신장: "); int height = stdIn.nextInt();
	    System.out.print("체중: "); int weight = stdIn.nextInt();
	    q[i] = new Human(name, height, weight); // 배열에 입력값 저장
	}

	
	
//	2차원배열 생성과 동시에 초기화 3행 2열
	Human[][] x = {
			{ new Human("김철수", 175, 52), new Human("김영희", 169, 60) },
			{ new Human("홍길동", 178, 70), new Human("이철수", 172, 61) },
			{ new Human("이영희", 168, 59), new Human("김길동", 165, 59) },
	};
		System.out.print("배열 y의 행 수 : ");
		n = stdIn.nextInt();
		
		Human[][] y = new Human[n][];
		for (int i = 0; i < y.length; i++) {
			System.out.print("y[" + i + "]의 열수: ");
			n = stdIn.nextInt();
			y[i] = new Human[n];
			for (int j = 0; j < y[i].length; j++) {
				System.out.println("y[" + i + "][" + j + "]");
				System.out.print("이름: "); String name = stdIn.next();
				System.out.print("신장: "); int heigt = stdIn.nextInt();
				System.out.print("체중: "); int weight = stdIn.nextInt();
				y[i][j] = new Human(name, height, weight);
			}
		}
		System.out.println("ㅁ배열 p");
		printHumanArray(p);
		
		System.out.println("ㅁ배열 q");
		printHumanArray(q);
		
		System.out.println("ㅁ배열 x");
		for (int i = 0; i < x.length; i++) {
			System.out.printf("%d행\n", i);
			printHumanArray(x[i]);
		}
		System.out.println("ㅁ배열 y");
		for (int i = 0; i<y.length; i++) {
			System.out.printf("%d행\n", i);
			printHumanArray(y[i]);
		}
		
		
	
	}

}
