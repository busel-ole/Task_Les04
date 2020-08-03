package by.htp.less01.main;

public class Exercise_7 {
	public static void main(String [] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int x = 0;
		
		if (a < 0) {
			x++;
		}
		if (b < 0) {
			x++;
		}
		if (c < 0) {
			x++;
		}
		System.out.print(" оличество отрицательных чисел: " + x);
	}

}

//ѕодсчитать количество отрицательных среди чисел а, b, с.