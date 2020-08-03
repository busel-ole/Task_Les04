package by.htp.less01.main;

public class Exercise_2 {
	public static void main (String [] args) {
		
		int a = 2;
		int b = 2;
		int c = 1;
		int d = 1;
		
		double xStage1 = (a / c) * (b / d);
		double x = xStage1 - ((a * b  - c) / (c * d));
		
		System.out.println(xStage1);
		System.out.println(x);
	}
}
