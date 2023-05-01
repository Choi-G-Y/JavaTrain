package T230501;
/* 휴먼 클래스 02
 * 
 * 230501
 */
public class Human2 {
	private String name;
	private int height;
	private int weight;
	
public	void Human(String n, int h, int w) {
		name = n; height = h; weight = w;
	}
	String getName() { return name; }
	int getHeight() { return height; }
	int getWeight() { return weight; }
	
	void gainWeight(int w) {weight += w;}
	void reduceWeight(int w) {weight -= w;
	
	}
}
