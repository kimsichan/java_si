package D3;

public class ForEvenEx1 {

	public static void main(String[] args) {
		/* 1부터 10까지 짝수들만 출력하는 코드를 for문을 이용하여 작성
		 * 출력예시)
		 * 2
		 * 4
		 * 6
		 * 8
		 * 10
		 */
		int i;
		System.out.print("---방법1---");
		for(i = 1 ;i <= 10 ;i++ ) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.print("---방법2---");
		for(i = 2 ;i <= 10 ;i = i + 2 ) {
		System.out.print(i + " ");
		}
		System.out.print("---방법3---");
	for(i = 1 ;i <= 5 ;i++ ) {
			System.out.print(2*i + " ");
		}
	}

}
