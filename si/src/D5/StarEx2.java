package D5;

public class StarEx2 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 코드를 작성하세요.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * 반복횟수 : i는 1부터 5까지 증가
		 * 규칙성 : *을 i개 출력하고 엔터를 출력
		 * 		 반복횟수 : j 를 1부터 i 까지 1씩 증가
		 * 		 규칙성 : *을 출력 
		 *  	 반목문 종료 후 엔터출력*/
		//*은 4개 출력 
		int i,j;
		/*for(i=1; i<=4; i++) {
			System.out.print("*");
			}
			*/
		i = 1;
		while(i<=5) {
			j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		}
	}


