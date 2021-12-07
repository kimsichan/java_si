package Homework;

import java.util.Scanner;

public class UpDown1 {

	public static void main(String[] args) {
			/*up, down 게임
			- 랜덤으로 숫자를 만든 후 만들어진 숫자를 맞추는 게임
			- 숫자 범위는 1~100사이
			- 예시(랜덤으로 만들어진 수 49)
			정수 : 50
			down
			정수 : 25
			up
			정수 : 40
			up
			정수 : 45
			up
			정수 : 49
			정답*/
			int random = (int)(Math.random()*100)+1;
			
			Scanner scan = new Scanner(System.in);
			while(true) {
				System.out.print("숫자를 입력하세요 : ");
				int abc = scan.nextInt();
				if(random < abc) {
					System.out.println("down");
				}else if(random > abc) {
					System.out.println("up");
				}else {
					System.out.println("정답입니다.");
					break;
				}
				
			}
	}

}
