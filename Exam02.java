
public class Exam02 {

	public static void main(String[] args) {

		// �ǽ� : 2���� 30������ ����� ���Ͻÿ�

		for (int j = 2; j <= 30; j++) {
			System.out.print(j + "�� ��� : ");
			for (int i = 1; i < j; i++) { // ������ ������� �ڱ��ڽ��� ���ԵǱ� ������ <=�� ���ϸ� ��ǥ ó���ϱ� ���ϴ�.
				if (j % i == 0) {
					System.out.print(i + ",");
				}
			}
			System.out.println(j);
		}

	}

}
