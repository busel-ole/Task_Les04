package by.htp.less01.main;

public class Exercise_6 {
	public static void main(String [] args) {
		int a = 30;
		int b = 1;
		
		if (180 <= (a + b)) {
			System.out.print("Треуголник не существует!");
			}else if(a + b == 90) {
				System.out.print("Треугольник прямоугольный!");
				}else if ((a + b) < 180){
					System.out.print("Треугольник существует!");
					}else {
						System.out.print("Треуголник не существует!");
					}
	}

}
//Даны два угла треугольника (в градусах).
//Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
//((a + b) < 180)