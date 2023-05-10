package T230510;

public class ExCar extends Car {
	private double totalMileage;
	
//	생성자
public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
	super(name, width, height, length, fuel, purchaseDay);
	totalMileage = 0.0;
}
//	총 주행거리 확인
	public double getTotalMileage() {
		return totalMileage;
	}
	
//	사양 표시
	public void putSpec() {
		super.putSpec();
		System.out.printf("총 주행 거리: %.2fkm\n", totalMileage);
	}
//	x방향으로 dx, y방향으로 dy이동
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy *dy);
		
		if (!super.move(dx, dy))
		return false;
		else {
//			총 주행거리, 이동완료
			totalMileage += dist;
			return true;
		}
	}
	
	
}
