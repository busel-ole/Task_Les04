package by.htp.less01.main;

public class Exercise_1 {
	public static void main(String [] args) {
		
		int a = 2;
		int b = 3;
		int c = 5;
		
		int z = 4;
		int y = 3;
		
		double xStage1 = b +(Math.sqrt(Math.pow(b, 2) + (z * a * c)));
		double xStage2 = xStage1/(2 * a);
		double xStage3 = xStage2 * (Math.pow(a, 3) * c);
		double x = xStage3 - (Math.pow(b, -2));
		
		//System.out.println(xStage1);
		//System.out.println(xStage2);
		//System.out.println(xStage3);
		System.out.println(x);
	}

}
