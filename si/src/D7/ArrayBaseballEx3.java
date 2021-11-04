package D7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBaseballEx3 {

	public static void main(String[] args) {
		/*숫자 야구 게임에서 컴퓨터가 랜덤한 수를 생성하도록 코드를 작성하세요
		 * */
		
		//컴퓨터가 1~9사이의 중복되지않은 세수를 저장하는 코드를 작성
		
		Scanner scan = new Scanner(System.in);
		int com [] = new int[3];
		int min=1,max=9;
		int count =0;
		do {
			//랜덤한 수 생성
			int random = (int)(Math.random()*(max-min+1)+min);
			//배열에 중복된 값이 있는지 확인하는 반복문
			int i;
			for(i = 0;i<count ; i++) {
				//중복된 수가 있으면 반복문을 중단
				if(com[i] == random) {
					break;
				}
			}
			if(i == count) {
				com[i]=random;
				count++;
			}
		}while(count !=3);
		
		//사용자가 세 수를 무한으로 입력 받음
		int user [] = new int[3];
		int strike = 0,ball = 0;
		
		
		do {
			System.out.print("사용자 : ");
			for(int i = 0; i<user.length; i++) {
				user[i] = scan.nextInt();
			}
			//스트라이크 갯수를 계산하여 스트라이크 갯수를 출력
			//컴퓨터 : 1 3 2
			//사용자 : 1 2 3
			//1
			strike = 0;
			ball = 0 ;
			/*if(com[0] == uesr[0]) {
				strike++;
			}
			if(com[1] == uesr[1]) {
				strike++;
			}
			if(com[2] == uesr[2]) {
				strike++;
			}*/
			for(int i = 0; i<com.length; i++) {
				if(com[i] == user[i]) {
					strike++;
				}
			}
			//볼의 갯수를 계산하여 볼의 갯수를 출력
			for(int i = 0; i<com.length; i++) {
				for(int j = 0; j<com.length; j++) {
					if(i==j) {
						continue;
					}
					if(com[i]==user[j]) {
						ball++;
					}
				}
			}
			//스트라이크만 있는 경우는 xS
			//볼만 있는 경우는 xB
			//스트라이크와 볼이 같이 있는 경우 xSyB
			//스트라이크와 볼이 없는 경우 3O이 출력되도록 작성해보세요.
			if(strike!=0) {
				System.out.print(strike + "S");
			}
			if(ball!=0) {
				System.out.print(ball + "B");
			}
			if(strike == 0 && ball ==0) {
				System.out.print(" 3O ");
			}
			System.out.println();			
		}while(strike!=3);		
	
		System.out.println("정답입니다. 프로그램을 종료합니다.");
		
		scan.close();

	}

}
