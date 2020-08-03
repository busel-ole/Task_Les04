package by.htp.less01.main;

public class Exercise_8 {
	public static void main(String [] args) {
		
		int aHole = 2;			//Высота дыры
		int bHole = 7;			//Ширина дыры
		
		int xBrick = 1;			//Высота кирпича
		int yBrick = 8;			//Ширина кирпича
		int zBrick = 8;			//Глубина кирпича
		
		if(((aHole >= xBrick) & (bHole >= yBrick)) || ((aHole >= xBrick) & (bHole >= zBrick))) {
			System.out.print("Пролезет");
		}else {
			System.out.print("Не пролезет");
		}
		
	}
}
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//Определить, пройдет ли кирпич через отверстие.