package by.htp.les01.main;
import static java.lang.Math.*;

public class exercise9 {
	public static void main(String[] args) {
		int n = 4;									//����������� �������
		int[] mas1 = new int[n];
		for(int i = 0; i < n; i++) {				// �������� � ���������� ��������� ������� 
			mas1[i] = i + 1;
		}
		long[][] mas2 = new long[n][n];				// ��������� ������
		long mas2Sum = 0;
		
			if(n <= 16) {
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						long nMas1 = mas1[j];					// ������� ����������� �������
						mas2[i][j] = (long) pow(nMas1, i + 1);	// ���������� � ������� �������� ���������� �������
						mas2Sum = mas2Sum + mas2[i][j];			// ����� ���������					
					}			
				}
				
			
				for(int i = 0; i < n ; i++) {							//����� � ������� �������
					for(int j = 0; j < n; j++) {
						System.out.print(mas2[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				System.out.print("����� ��������� �������:" + " " + mas2Sum);
			}else {			
				System.out.print("��������� ������������ �������� \"n\". ������������ �������� \"16\"");
			}
	}
}
