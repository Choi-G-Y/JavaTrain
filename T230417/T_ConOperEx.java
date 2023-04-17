package T230417;
/*230417
 * 무자비한 학점 자판기Mk.1
  score를 grade로 변환시켜 답변을 등급으로 내주는 코드
  
 */
import java.util.Scanner;

public class T_ConOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
				System.out.print("점수 입력: ");
		
		int score = scanner.nextInt();
		
		char grade = 'F';
		

	    if (score > 90) 
	    {
	        grade = 'A';
	    } 
	    else if (score > 80) 
	    {
	        grade = 'B';
	    } 
	    else if (score > 70) 
	    {
	        grade = 'C';
	    } 
	    else if (score > 60) 
	    {
	        grade = 'D';
	    }

		
		System.out.println("당신의 학점은" + grade  + "입니다.");
		
		
	}

}