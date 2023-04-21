package T230421;
/* 요소개수가 5인 double형을 만들었고
 * 앞에서부터 1.1 2.2 ~ 5.5를 대입해서 표시 코드
 * 230421
 */
public class T_DoubleArrayFor {

	public static void main(String[] args) {
		double[] a = new double[5];
		
		for (int i = 0; i < a.length; i++)
			a[i] = (i+1) * 1.1;
		
		
		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
