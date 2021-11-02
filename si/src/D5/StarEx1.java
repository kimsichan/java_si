package D5;

public class StarEx1 {

	public static void main(String[] args) {
		/* 반목문을 이용하여 다음과 같이 출력되는 코들를 작성하세요.
		 * *****  i=1 *=5
		 * *****  i=2 *=5
		 * *****  i=3 *=5
		 * *****  i=4 *=5
		 * *****  i=5 *=5
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 : *을 5번씩 출력
		 * 		 반복횟수 : j는 1부터 5까지 1씩증가
		 * 		 규칙성 : *을 출력
		 * */ 
		int i , j;
		for(i=1; i<=3; i++) {
			for(j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();//엔터
		}
		/*int i , j;
		for(i=1; i<=3; i++) {
			for(j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();//엔터
		}*/
	}

}
