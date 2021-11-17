package D16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExbListEx2 {

	public static void main(String[] args) {
		/* 그린고등학생 국어, 영어, 수학 성적을 관리하려 한다.
		 * 관리하기 위한 리스트를 만들어 보세요. */
		//국어, 영어, 수학 성적을 각각 리스트로 만들어서 관리 방법
		//번지가 같으면 같은 학생의 성적이라는 가정이 필요
		//가능은 하지만 좋은 방법은 아님
		ArrayList<ExbStudent> stdList = new ArrayList<ExbStudent>();
		Scanner scan = new Scanner(System.in);
		int menu;
		do {
			//메뉴 출력
			System.out.println("메뉴");
			System.out.println("1. 학생정보 추가");
			System.out.println("2. 전체 학생정보 출력");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴를 선택하세요 : ");
			
			//메뉴 선택
			menu = scan.nextInt();
			
			//선택된 메뉴에 따라 동작 실행
			switch(menu) {
			//학생 정보 추가 기능
			case 1:	inputStudent(scan, stdList);
				break;
			//전체 학생 정보 추가 기능
			case 2: printStudentList(stdList);
				break;
			case 3:	break;
			default : System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 3);
		System.out.println("프로그램을 종료합니다.");
		
		char next = 'y';
		int select;
		while(next == 'y' || next == 'Y') {
			inputStudent(scan, stdList);
			
			System.out.print("학생 정보를 더 입력하겠습니까? ");
			next = scan.next().charAt(0);
		}
		
		printStudentList(stdList);
		/* 학생 성적을 관리하는 프로그램을 만들어보세요
		 * 메뉴 
		 * 1. 학생정보 추가
		 * 2. 전체 학생정보 출력
		 * 3. 프로그램 종료*/
		for(int i = 0 ;  ;i++) {
			System.out.println("-----------"); 
			System.out.println("메뉴"); 
			System.out.println("1. 학생정보 추가");
			System.out.println("2. 전체 학생정보 출력");
			System.out.println("3. 프로그램 종료");
			select = scan.nextInt();
			if(select == 1) {
				inputStudent(scan, stdList);
			}
			if(select == 2) {
				printStudentList(stdList);
			}
			if(select == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		scan.close();
	}	
	public static ExbStudent inputStudent(Scanner scan) {
			System.out.println("학생 정보를 입력하세요.");
			System.out.print("학년 : ");
			int grade = scan.nextInt();
			System.out.print("학반 : ");
			int classNum = scan.nextInt();
			System.out.print("번호 : ");
			int num = scan.nextInt();
			System.out.print("이름 : ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("성적을 입력하세요.");
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			System.out.print("수학 : ");
			int math = scan.nextInt();
			ExbStudent std = new ExbStudent(grade, classNum, num, name, kor, eng, math);
			return std;
	}
	public static void inputStudent(Scanner scan, ArrayList<ExbStudent> stdList) {
		ExbStudent std = inputStudent(scan);
		stdList.add(std);
	}
	public static void printStudentList(ArrayList<ExbStudent> stdList) {
		Iterator<ExbStudent> it = stdList.iterator();
		while(it.hasNext()) {
			ExbStudent tmp = it.next();
			System.out.println(tmp);
	}
	}
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생정보 추가");
		System.out.println("2. 전체 학생정보 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
		
	}
}
