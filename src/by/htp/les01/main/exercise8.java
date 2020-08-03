package by.htp.les01.main;

public class exercise8 {
	public static void main(String[] args) {
		int n = 6;
		int [][] mas = new int [n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i; j++) {					//лимитирование индекса j (количества столбцов столбца)
				mas[i][j] = j + i + 1;								//заполнение строки
			}
		}
		for(int k = 0; k < n ; k++) {							//вывод в консоль матрицы
			for(int m = 0; m < n; m++) {
				System.out.print(mas[k][m] + " ");
			}
			System.out.println();
		}
	}
}



