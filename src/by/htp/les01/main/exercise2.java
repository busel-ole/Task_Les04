package by.htp.les01.main;

public class exercise2 {
	public static void main(String[] args) {
		int k = 0;						//����� ������
		int p =	3;						//����� �������
		int [][] mas = new int [][] {
			{1,2,3,4,5},
			{4,2,8,8,7},
			{0,6,1,5,3},
			{3,7,7,6,5},
			{1,2,3,4,5},
			};					//�������� �������
		
		System.out.print("������ �" + (k) + ": ");
		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[k][i] + " ");
			}
		
		System.out.println();
		System.out.print("������� �" + (p) + ": ");
		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][p] + " ");
		}	
	}
}
