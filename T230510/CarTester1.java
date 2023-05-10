package T230510;

public class CarTester1 {

	public static void main(String[] args) {
		Car car1 = new Car("W140", 1885, 1490, 5220, 95.0,
				new Day(2018, 10, 13));
		
		ExCar car2 = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));
		
//		클래스형 변수는 자기자신의 형 인스턴스를 참조할수 있고, 하위 클래스형의 인스턴스도 참조 가능
		Car x;
		x = car1;
		x = car2;
		
		System.out.println("x구입일: " + x.getPurchaseDay());
//		클래스형 변수는 상위 클래스형의 인스턴스는 참조할 수 없고 자기자신의 형 인스턴스는 참조할 수 있다.
		ExCar y;
//		y = car1;
		y = car2;
		
		System.out.println("y구입일: " + y.getPurchaseDay());
		System.out.println("y의 총 주행거리: " + y.getTotalMileage());
		
	}

}
