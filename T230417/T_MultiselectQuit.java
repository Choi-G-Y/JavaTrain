package T230417;
/* 230417
 * while문을 이용한 무한반복 학점자판기
문장 마지막에 else를 넣지않아 오류가 터지는걸 못찾아서 죽을맛이였다.
 */
import java.util.Scanner;

public class T_MultiselectQuit {
	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("점수 입력: ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            int score = Integer.parseInt(input);
            char grade;
//괄호를 잘 달아야 헷갈리지 않는다
            if (score >= 90) 
            {
                grade = 'A';
            } 
            else if (score >= 80) 
            {
                grade = 'B';
            } 
            else if (score >= 70) 
            {
                grade = 'C';
            } 
            else if (score >= 60) 
            {
                grade = 'D';
            } 
//            else를 안썼더니 오류가 끝나질 않아서 설마했는데 else문을 넣어서 끝내야했다
            else 
            {
                grade = 'F'; 
            }

            System.out.println("당신의 학점은 " + grade + "입니다");
        }
    }
}

