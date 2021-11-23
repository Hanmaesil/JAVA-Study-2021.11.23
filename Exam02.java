
public class Exam02 {

	public static void main(String[] args) {

		// 실습 : 2부터 30까지의 약수를 구하시오

		for (int j = 2; j <= 30; j++) {
			System.out.print(j + "의 약수 : ");
			for (int i = 1; i < j; i++) { // 어차피 약수에는 자기자신이 포함되기 때문에 <=을 안하면 쉼표 처리하기 편하다.
				if (j % i == 0) {
					System.out.print(i + ",");
				}
			}
			System.out.println(j);
		}

	}

}
