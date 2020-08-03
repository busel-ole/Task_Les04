package by.htp.les01.main;

public class excercise10 {
	public static void main(String[] args) {
		int n = 10;
		int [][] mas = new int [n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {						//создание и заполнение массива
				mas[i][j] = (int) (Math.random()*(18+1)) - 9;
			}
		}
		for(int i = 0; i < n ; i++) {							//вывод в консоль матрицы
			for(int j = 0; j < n; j++) {
				if(mas[i][j] < 0) {
					System.out.print(mas[i][j] + " ");
				}else {
					System.out.print(" " + mas[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Положительные числа диагонали: ");
		for(int i = 0; i < n; i++) {
			if(mas[i][i] >= 0) {
				System.out.print(mas[i][i] + ", ");				
			}
		}
	}
}
