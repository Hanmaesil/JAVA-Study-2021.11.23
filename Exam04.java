
public class Exam04 {

	public static void main(String[] args) {
		
		//�迭
		//1 . queue ���� : ����������� ù��° ���� ���������� �������� ���̰� �����͸� �������� �ǹؿ� ���� ���´�. first in first out, last in last out
		//2 . stack ���� : �Ʒ��� ���� �ٱ��� �������� ó�� ���� ������ ���� ���̴µ� �������� ������ ���°� ���� ������. first in last out, last in fisrt out
		//3 . tree ���� : ex) �����Ͷ�� ū �󺧸� ���̰� �Ʒ��� ����ó�� ���� ������.
		//4 . list ���� : 
		//5 . array ���� : ���η� ĭĭ�� �ϳ��� �־��ش�! index ��ȣ�� ���ؼ� �ҷ��´�.
		
		//�迭(array) : ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��. 
		// *���۷��� ���� Ư¡ : new �� ����!, �����ȿ� ���� ���°� �ƴ϶� �ּҰ��� ������ �ִ�.
		
		//���̰� 5�� ������ �迭 array ����
		int[] array = new int[5]; // �迭Ÿ�� + [](�迭����) + �迭�� ���� ���۷��� ���� = new(�迭 ����) + ������ �迭�� ������ Ÿ�� + [4](�迭 ���̴� 4) 
			
		array[0] = 27;
		array[1] = 3;
		array[2] = 123;
		array[4] = 77;
		
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
	}

}
