
public class Exam04 {

	public static void main(String[] args) {
		
		//배열
		//1 . queue 구조 : 통로형식으로 첫번째 넣은 데이터위로 차곡차곡 쌓이고 데이터를 꺼낼때는 맨밑에 부터 나온다. first in first out, last in last out
		//2 . stack 구조 : 아래가 막인 바구니 형식으로 처음 넣은 데이터 위로 쌓이는데 나갈때는 마지막 들어온게 먼저 나간다. first in last out, last in fisrt out
		//3 . tree 구조 : ex) 데이터라는 큰 라벨링 붙이고 아래로 가지처럼 뻗어 나간다.
		//4 . list 구조 : 
		//5 . array 구조 : 가로로 칸칸히 하나씩 넣어준다! index 번호를 통해서 불러온다.
		
		//배열(array) : 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것. 
		// *레퍼런스 변수 특징 : new 가 들어간다!, 변수안에 값이 들어가는게 아니라 주소값을 가지고 있다.
		
		//길이가 5인 정수형 배열 array 생성
		int[] array = new int[5]; // 배열타입 + [](배열선언) + 배열에 대한 레퍼런스 변수 = new(배열 생성) + 선언한 배열과 동일한 타입 + [4](배열 길이는 4) 
			
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
