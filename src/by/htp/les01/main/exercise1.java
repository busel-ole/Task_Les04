package by.htp.les01.main;

public class exercise1 {
	public static void main(String[] args) {

		int [][] mas = new int [][] {
			{1,2,3,4,5},
			{4,2,8,8,7},
			{0,6,1,5,3},
			{3,7,7,6,5},
			{1,2,3,4,5},
			};					//создание массива
		
		for(int i = 0; i < mas.length; i++) {			
			System.out.print(mas[i][i] + " ");			//вывод диаглнали
			}
		System.out.println();
	}	
}
