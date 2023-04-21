package T230421;
/* 각 요소에 5 4 3 2 1을 대입
 * 
 * 230421
 */
public class T_IntArrayfor {

	public static void main(String[] args) {
		int[] a = new int[5];
		
		
		for (int i = 0; i < a.length; i++)
			a[i] = 5 - i;
				
		for (int i =0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
			
	}

}
