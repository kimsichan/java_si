package D5;

public class StarEx2 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 반복문을 이용하여 코드 작성
		 * *      i=1 *1 enter
		 * **     i=2 *2 enter
		 * ***    i=3 *3 enter
		 * ****   i=4 *4 enter
		 * *****  i=5 *5 enter
		 * 반복횟수: i는 1부터 5까지 1씩 증가
		 * 규칙성: *을 i개 출력하고 엔터를 출력
		 *      반복횟수: j를 1부터 i까지 1씩 증가
		 *      규칙성: *를 출력
		 *      엔터를 출력
		 */
		int i=1,j;
		for(i =1; i<=4; i++) {
			//System.out.print("*");
		}
		i =1;
		
		while(i<=5) {
			j =1;
			while
				(j<=i) {
				System.out.print("*");
				j++;
			
			}
			System.out.println();
			i++;
		
		}
	
	}
}