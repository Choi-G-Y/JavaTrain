package T230510;
/*지옥에서 돌아온 ExCar
 * 만들어놓은 Class에서 항목갯수가 맞지 않아 계속 오류가 생겼었음
 * 갯수 확인 잘할것
 * 230510
 */
public class ExcarTester1 {

	public static void main(String[] args) {
		ExCar myCar = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015,12,24));
		System.out.printf("현재위치: (%.2f,%.2f)\n", myCar.getX(), myCar.getY());
		System.out.printf("남은연료: %.2f리터\n", myCar.getFuel());
		System.out.printf("구 입 일: %s\n", myCar.getPurchaseDay());
		
		
	}
	

}
