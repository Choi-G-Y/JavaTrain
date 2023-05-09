package T230509;
/*은행계좌 클래스 ver.3
 * 
 * 은행계좌 예제풀이에 사용될 Account
 */
public class Account {
//	몇 번까지 식별 번호를 부여했는가
	
	private static int counter = 0;
	
	private String name;
	private String no;
	private long balance;
	private Day_ver2 openDay;
	private int id;
	
//	인스턴스 초기화 블록
	{
		id = ++ counter;
		System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
	}
//	생성자(예금액 0, 개설일은 오늘)
	public Account (String name, String no) {
		this(name, no, 0, new Day_ver2());
	}
//	생성자
	public Account(String name, String no, long balance, Day_ver2 openDay) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = new Day_ver2(openDay);
		
	}
//	계좌 명의 확인
	public String getName() {
		return name;
	}
//	계좌번호 확인
	public String getNo() {
		return no;
	}
//	예금 잔고 확인
	public long getBalance() {
		return balance;
	}
//	식별 번호 가져오기
	public int getId() {
		return id;
	}
//	계좌 개설일 확인
	public Day_ver2 getOpDay_ver2() {
		return new Day_ver2(openDay);
	}
//	k원 입금
	void deposit(long k) {
		balance += k;
	}
//	k원 출금
	void withdraw(long k) {
		balance -= k;
	}
//	문자열 표현에 의한 계좌 기본정보 반환
	public String toString() {
		return "{" + name + ", " + no + ", " + balance + "}";
	}
}
