package newZero;


public class Main {
	public static void main(String args[]) {
		Point p1 = new Point();
		int[] a1 = new int[5];
		
		a1[1] = 2;
		int[] a2 = a1;
		a2[1] = 5;
		
		System.out.println(a1[1]);
	}

}
