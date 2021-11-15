package Homework;

import java.util.Scanner;




public class HomeworkEllipse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ExaShape list [] = new ExaShape[10];
		ExaShape del [] = new ExaShape[10];
		
		for(int i = 0 ; i<list.length;i++) {
			System.out.println("메뉴"); 
			System.out.println("1. 도형그리기");
			System.out.println("2. 다시실행");
			System.out.println("3. 실행취소");
			System.out.println("4. 도형 확인");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴를 선택하세요 : ");
			int a = scan.nextInt();
			System.out.println("--------------");
			
			if(a == 1) {
				System.out.print("그릴 도형을 선택하세요(1. 사각형, 2. 타원) : ");
				int b = scan.nextInt();
				System.out.print("점 두개를 입력하세요(예 : 1 2 3 4 => (1,2) (3,4)) : ");
				if(b==1) {
					list[i]= new ExaRect(scan.nextInt(), scan.nextInt(),scan.nextInt(), scan.nextInt());
					((ExaRect) list[i]).testR();
					System.out.println("--------------");
				}else if(b==2) {
					list[i] = new ExaEllipse(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
					((ExaEllipse) list[i]).testE();
					System.out.println("--------------");
				}
			}
			if(a==2) {
				
			}
			if(a==3) {
			}
			
			
			
			if(a==4) {
				for(ExaShape tmp : list) {
					if(tmp!=null) {
						if(tmp instanceof ExaEllipse ) {
							ExaEllipse e = (ExaEllipse)tmp;
							e.print();
						}
						else if(tmp instanceof ExaRect) {
							ExaRect r = (ExaRect)tmp;
							r.print();
						}
					}
				}
			}
			if(a == 5) {
				System.out.println("종료");
				break;
			}
			
			
			
		}
		scan.close();
		  
	}

}
