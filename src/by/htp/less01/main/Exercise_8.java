package by.htp.less01.main;

public class Exercise_8 {
	public static void main(String [] args) {
		
		int aHole = 2;			//������ ����
		int bHole = 7;			//������ ����
		
		int xBrick = 1;			//������ �������
		int yBrick = 8;			//������ �������
		int zBrick = 8;			//������� �������
		
		if(((aHole >= xBrick) & (bHole >= yBrick)) || ((aHole >= xBrick) & (bHole >= zBrick))) {
			System.out.print("��������");
		}else {
			System.out.print("�� ��������");
		}
		
	}
}
//������ ������� �, � �������������� ��������� � ������� �, �, z �������.
//����������, ������� �� ������ ����� ���������.