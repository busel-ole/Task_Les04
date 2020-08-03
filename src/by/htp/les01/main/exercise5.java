package by.htp.les01.main;

public class exercise5 {
	public static void main(String[] args) {
		int n = 9;										//размерность массива
		int [][] mas = new int [n][n];					//создание массива
		
		for(int i = 0 ; i < n; i++) {					//цикл увеличения i до велечины n - 1
			int j = (n - 1) - i;						//вычисление j
			mas [j][i] = n - i;							//запись значения в координаты дополнительной диагонали
		}
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
