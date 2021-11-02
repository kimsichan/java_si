package D5;

public class StarEx4 {

	public static void main(String[] args) {
		/* 다음과 같이 출력되도록 코드를 작성하세요.
		 *      *     i=1 공=4   *=1
		 *     ***    i=2 공=3   *=3
 		 *    *****   i=3 공=2   *=5
		 *   *******  i=4 공=1   *=7
		 *  ********* i=5 공=0   *=9
		 *                공=5-i *=2*i-1  
		 *  
		 *      *      i=1 공=4   *=1 *=0
		 *     ** *    i=2 공=3   *=2 *=1
 		 *    *** **   i=3 공=2   *=3 *=2
		 *   **** ***  i=4 공=1   *=4 *=3
		 *  ***** **** i=5 공=0   *=5 *=4
		 *                공=5-i  *=i *=i-1 
		 * */ 
		int num = 5 , i , j ;
		for(i=1 ; i<=num; i++) {
			for(j=1; j<=num-i; j++) {
			System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(j=1; j<=i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//방법1.
		i = 1;
		while(i<=num) {
			j=1;
			while(j<=num-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
