package by.htp.les01.main;

public class exercise6 {
	public static void main(String[] args) {
		int n = 8;
		int [][] mas = new int [n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {						//��������� ���� ������ ������
				if(i == 0 | j == 0 | i == n - 1 | j == n -1 ) {	//��������� ������� ������ ������ 
					mas [i][j] = 1;								//������ �������� � ��������� ������ 	
				}
			}
				}
		for(int k = 0; k < n ; k++) {							//����� � ������� �������
			for(int m = 0; m < n; m++) {
				System.out.print(mas[k][m] + " ");
			}
			System.out.println();
		}
	}
}