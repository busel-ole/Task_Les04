package by.htp.les01.main;

public class exercise4 {
	public static void main(String [] args) {
		int n = 4;									//размерность массива
		int [][] mas = new int [n][n];				//создание массива
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++){				//вложенный цикл перечесления элементов массива
			if(i % 2 == 0) {						//проверка чётности (чётность строки)
				mas[i][j] = j + 1;					//действие в чётной строке
			}else {
				mas[i][j] = n - j;					//действие в нечётной строке
				}
			}
			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}

}
