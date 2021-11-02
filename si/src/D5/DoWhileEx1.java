package D5;

public class DoWhileEx1 {

	public static void main(String[] args) {
		/* do while문을 이용한 Hello 5번 출력 예제*/
		int i = 10;
		do {
			System.out.println("Hello");
			i++;
		}while(i<=5);
		/* 정수의 초기값이 10시작해서 1씩 증가하면서 5보다 작거나 같은 정수를 출력하는 예제 */
		System.out.println("for문을 이용 ");
		for(i=10; i<=5; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("do while문을 이용 ");
		i = 10;
		do {
			System.out.println(i + " ");
			i++;
		}while(1<=5);
	}

}
