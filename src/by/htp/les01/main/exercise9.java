package by.htp.les01.main;
import static java.lang.Math.*;

public class exercise9 {
	public static void main(String[] args) {
		int n = 4;									//размерность массива
		int[] mas1 = new int[n];
		for(int i = 0; i < n; i++) {				// создание и заполнение линейного массива 
			mas1[i] = i + 1;
		}
		long[][] mas2 = new long[n][n];				// двумерный массив
		long mas2Sum = 0;
		
			if(n <= 16) {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						long nMas1 = mas1[j];					// элемент одномерного массива
						mas2[i][j] = (long) pow(nMas1, i + 1);	// возведение в степень элемента двумерного массива
						mas2Sum = mas2Sum + mas2[i][j];			// сумма элементов					
					}			
				}
				
			
				for(int i = 0; i < n ; i++) {							//вывод в консоль матрицы
					for(int j = 0; j < n; j++) {
						System.out.print(mas2[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				System.out.print("сумма элементов массива:" + " " + mas2Sum);
			}else {			
				System.out.print("ѕривышено максимальное значение \"n\". ћаксимальное значение \"16\"");
			}
	}
}
