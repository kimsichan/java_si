package D5;

import java.util.Scanner;

public class PrimeNumEx1 {

	public static void main(String[] args) {
		/*2부터 100이하의 모든 소수를 출력하는 예제
		 * 
		 */
		int num = 2;
		int i = 1, count =0;
		while(num<=100) {//num=2 followed by num=3...
			i =1;
			count =0; //변수초기화 한번더 안에서
		
			while(i<=num) {
				if(num % i == 0) {
					count++;
				}
				i++;
			}
			if(count == 2) {
				System.out.print(num + " ");
			}
			num++;
		}
	}

}
