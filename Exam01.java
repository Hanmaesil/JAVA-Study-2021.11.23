import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ��� ���ϱ�

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		System.out.print(num + "�� ����� ");
		// num%i == 0; i�� 1�� ������Ű�� ~~ ��� ���ϴ� �ڵ�

		for (int i = 1; i <= num; i++) { //i�� 1�� �������Ѽ� num���� ���� �������� �ݺ���Ų��. 
			if (num % i == 0) {				// ��� ���ϴ� �ڵ�
				System.out.print(i);		// ��� �϶� ���
				if (num == i)				// ���������� ��ǥ�� ������ �ϱ⶧���� ���� ���������� break�� �����.
					break;
				System.out.print(", "); //��ǥ ���
			}
		}
		System.out.println(" �Դϴ�.");
	
		//Ǯ��
//		for (int i = 1; i < num; i++) { 
//			if (num % i == 0) {				
//				System.out.print(i +",");		
//			}
//		}System.out.println(num);
//		
		
		
}
}
	
	
	
	



