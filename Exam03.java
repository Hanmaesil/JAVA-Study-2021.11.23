
public class Exam03 {

	public static void main(String[] args) {

		// �ǽ� : 1 ~ 1000 ������ ������ �������� ����Ͻÿ�

		for (int j = 1; j <= 1000; j++) {
			int k = 0;
			for (int i = 1; i < j; i++) // for (int i = 1; i <= j/2; i++)
				if (j % i == 0)
					k = k + i;
			if (k == j) {
				System.out.println(j);
			}

		}

	}
}
