package by.htp.les01.main;

public class exercise3 {
	public static void main(String [] args) {
		int a = 0;											//������� �������
		int m = 4;
		int n = 5;											//����������� �������
		int [][] mas = new int [m][n];						//�������� �������
		
		
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++){			//���������� �������
				//a = ++a;
				mas[i][j] = ++a;	
			}
			
		}
		
		for(int i = 0; i < mas.length; i++) {
			for(int j = 0; j < mas[i].length; j++) {
				if(i % 2 == 0) {										//�������� �������� (�������� ������)				
					System.out.print(mas[i][j] + " ");					//�������� � ������ ������
				}else {
					int r = (n - j) - 1;								//�������� �������
					System.out.print(mas[i][r] + " ");					//�������� � �������� ������
					}
			}
			System.out.println();
		}
	}
}
