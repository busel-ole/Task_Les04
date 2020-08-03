package by.htp.les01.main;

public class exercise3 {
	public static void main(String [] args) {
		int a = 0;											//элемент массива
		int m = 4;
		int n = 5;											//размерность массива
		int [][] mas = new int [m][n];						//создание массива
		
		
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++){			//заполнение массива
				//a = ++a;
				mas[i][j] = ++a;	
			}
			
		}
		
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++) {
				if(i % 2 == 0) {										//проверка чётности (чётность строки)				
					System.out.print(mas[i][j] + " ");					//действие в чётной строке
				}else {
					int r = (n - j) - 1;								//инверсия индекса
					System.out.print(mas[i][r] + " ");					//действие в нечётной строке
					}
			}
			System.out.println();
		}
	}
}
