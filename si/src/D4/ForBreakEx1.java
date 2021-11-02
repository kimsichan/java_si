package D4;

import java.util.Scanner;

public class ForBreakEx1 {

	public static void main(String[] args) {
		/* 0을 입력할 때까지 정수를 계속 입력받는 코드를 작성하세요.
		 * break문을 이용.
		 * 예)
		 * 정수를 입력하세요 : 1
		 * 정수를 입력하세요 : 1000
		 * 정수를 입력하세요 : -1
		 * 정수를 입력하세요 : -123
		 * 정수를 입력하세요 : 0
		 * 종료합니다.
		 * */
		Scanner scan = new Scanner(System.in);
		int num;//for문으로 작성한 경우 num의 초기값에 따라 실행이 안될 수 있다.
		for ( ; ; ) {
			System.out.print("정수를 입력하세요 : ");
			num = scan.nextInt();
			if(num == 0) {
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

}
