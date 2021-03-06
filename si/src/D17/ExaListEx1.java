package D17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import D16.ExbStudent;

public class ExaListEx1 {

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
			printMenu();
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:	inputStudent(scan, stdList);
				break;
			case 2: printStudentList(stdList);
				break;
			case 3: 
				if(deleteStudent(stdList, scan)) {
					System.out.println("학생 정보를 삭제했습니다.");
				}else {
					System.out.println("일치하는 학생 정보가 없습니다.");
				}
				break;
			case 4:
				if(modifyStudent(stdList, scan)) {
					System.out.println("학생 정보를 수정했습니다.");
				}else {
					System.out.println("일치하는 학생 정보가 없습니다.");
				}
				break;
			case 5:	break;
			default : System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 5);
		System.out.println("프로그램을 종료합니다.");
		
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
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 프로그램 종료");
		
		System.out.print("메뉴를 선택하세요 : ");
	}
	public static boolean deleteStudent(ArrayList<ExbStudent> stdList,Scanner scan) {
		System.out.println("삭제할 학생 정보를 입력해주세요");
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		ExbStudent std = new ExbStudent(grade, classNum, num, "", 0, 0, 0);
		return stdList.remove(std);
	}
	/* 기능 : Scanner를 이용하여 수정할 학생 정보와 성적, 이름을 입력받고
	 * 		 입력받은 학생 정보를 주어진 리스트에서 수정하여 수정 됐는지 안됐는지 알려주는 메소드
	 * 매개변수 : Scanner, 주어진 리스트 => Scanner scan, ArrayList<ExbStudent> stdList
	 * 리턴타입 : 수정 됐는지 안됐는지 => boolean
	 * 메소드명 : modifyStudent
	 * */
	public static boolean modifyStudent(ArrayList<ExbStudent> stdList,Scanner scan) {
		//특정 학생 정보 입력
		System.out.println("학생 정보를 입력하세요.");
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		
		//특정 학생 정보가 있으면 이름 , 성적을 입력 받음 
		//특정 학생 정보의 번지가 0 이상이면 이름, 성적을 입력받음
		ExbStudent std = new ExbStudent(grade, classNum, num, "", 0, 0,0);
		int index = stdList.indexOf(std);
		if(index >= 0) {
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
			//학생 정보 수정 
			//방법1. get()
			//리스트에서 학생 정보를 가져와서 이름과 성적만 수정
//			std = stdList.get(index);
//			std.setName(name);
//			std.setKor(kor);
//			std.setEng(eng);
//			std.setMath(math);
			//방법2.set()
			//입력받은 학생 정보와 이름 , 성적을 하나의 객체로 만들어서
			//리스트에 수정하는 방법
			std = new ExbStudent(grade, classNum, num, name, kor, eng, math);
			stdList.set(index, std);
			return true;
		}
		//없으면 끝
		return false;
	}
}
