package by.htp.les01.main;

public class exercise4 {
	public static void main(String [] args) {
		int n = 4;									//����������� �������
		int [][] mas = new int [n][n];				//�������� �������
		
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++){				//��������� ���� ������������ ��������� �������
			if(i % 2 == 0) {						//�������� �������� (�������� ������)
				mas[i][j] = j + 1;					//�������� � ������ ������
			}else {
				mas[i][j] = n - j;					//�������� � �������� ������
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
