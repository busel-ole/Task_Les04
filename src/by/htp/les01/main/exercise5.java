package by.htp.les01.main;

public class exercise5 {
	public static void main(String[] args) {
		int n = 9;										//����������� �������
		int [][] mas = new int [n][n];					//�������� �������
		
		for(int i = 0 ; i < n; i++) {					//���� ���������� i �� �������� n - 1
			int j = (n - 1) - i;						//���������� j
			mas [j][i] = n - i;							//������ �������� � ���������� �������������� ���������
		}
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
