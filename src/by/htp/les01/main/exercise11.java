package by.htp.les01.main;

public class exercise11 {
	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		int [][] mas = new int [n][m];								//создание массива
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {						//заполнение массива
				mas[i][j] = (int) (Math.random()*(16));
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.printf(mas[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("строки содержащие три и более чисел \"5\": ");
		for(int i = 0; i < n; i++) {
			int sumFives = 0;													//сумма пятёрок в строке
			for(int j = 0; j < m; j++) {
				if(mas[i][j] == 5) {
					sumFives = mas[i][j] + sumFives;
				}
					
				}
			if(sumFives >= 15) {
				System.out.print( (i+1) + " ");
			}
		}
	}
}
