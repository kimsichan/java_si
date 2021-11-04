package D7;

import java.util.Arrays;

public class ArrayRandomEx1 {

	public static void main(String[] args) {
		/* 1~9사이의 랜덤한 수를 3개 생성하여 배열에 저장하고 출력한느 코드를 작성하세요.
		 * */

		int num[] = new int[3];
		int min=1, max=9;
		for(int i=0; i<num.length;i++) {
			int random = (int)(Math.random()*(max-min+1)+min);
			num[i]=random;
					
		}
		System.out.print(Arrays.toString(num));

	}

}
