package ch04.sec06;

import java.util.Scanner;

public class Shipb {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ID를 입력하시오: ");
		String id = "ezen";
		String pw = "1234";
		int trycount = 0;
		
		while(trycount < 3) {
			String inputid = scanner.nextLine();
			if (!id.equals(inputid)) {
				System.out.println("ID가 일치하지 않습니다.");
				break;
			}
			System.out.print("pw를 입력해주세요: ");
			String inputpw = scanner.nextLine();
			if (pw.equals(inputpw)) {
				System.out.println("OK");
				return;
			} else {
				System.out.println("다시 입력해주세요.");
				trycount++;
			}
		}
		
		System.out.println("Get out!");
	}
}
