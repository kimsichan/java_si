package D5;

public class MutipleTableEx1 {

	public static void main(String[] args) {
		/* 2단에서 9단까지 구구단을 출력하는 코드를 작성하세요.
		 * */
		int num =2,j;
		while(num <= 9) {
			//num단 출력하는 코드
			j= 1;
			while(j<=9) {
				System.out.println(num + " X " + j + " = " + num * j);
				j++;
			}
			num++;
		}
		
		}
	}
