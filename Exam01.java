import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 약수 구하기

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.print(num + "의 약수는 ");
		// num%i == 0; i는 1씩 증가시키기 ~~ 약수 구하는 코드

		for (int i = 1; i <= num; i++) { //i를 1씩 증가시켜서 num값과 같아 질때까지 반복시킨다. 
			if (num % i == 0) {				// 약수 구하는 코드
				System.out.print(i);		// 약수 일때 출력
				if (num == i)				// 마지막에는 쉼표를 안찍어야 하기때문에 값이 같아질때는 break로 멈춘다.
					break;
				System.out.print(", "); //쉼표 출력
			}
		}
		System.out.println(" 입니다.");
	
		//풀이
//		for (int i = 1; i < num; i++) { 
//			if (num % i == 0) {				
//				System.out.print(i +",");		
//			}
//		}System.out.println(num);
//		
		
		
}
}
	
	
	
	



