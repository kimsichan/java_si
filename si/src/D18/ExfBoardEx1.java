package D18;

import java.util.*;


public class ExfBoardEx1 {

	public static void main(String[] args) {
		/* 게시글을 관리하는 프로그램을 만드세요.
		 * 기능 
		 * 1. 게시글 등록
		 * 2. 게시글 확인(전체)
		 * 3. 게시글 수정
		 * 4. 게시글 삭제
		 * 5. 프로그램 종료
		 * */ 
		//게시글 리스트 생성
		List<ExfBoard> list = new ArrayList<ExfBoard>();
		Scanner scan = new Scanner(System.in);
		//프로그램 시작
		while(true) {
			//메뉴 출력
			System.out.println("[기능]");
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 확인");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 게시글 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴를 선택하세요(1~5) : ");
			//메뉴 입력
			char ch = scan.next().charAt(0);
			//메뉴에 따른 기능 실행
			if(ch == '1') {
				inputStudent(scan, list);
			}else if(ch == '2') {
				printBoardList(list);
			}else if(ch == '3') {
				modify(ch, ch, null, null, null, null, scan);
			}else if(ch == '4') {
				System.out.println("4번 기능 ");
			}else if(ch == '5') {
				System.out.println("프로그램이 종료되었습니다. ");
				break;
			}
		}
		//프로그램 종료
	}

	public static ExfBoard inputStudent(Scanner scan) {
		System.out.print("게시글 제목 : ");
		String title = scan.next();
		System.out.print("게시글 내용 : ");
		String contents = scan.next();
		System.out.print("작성자 : ");
		String writer = scan.next();
		System.out.print("작성일 : ");
		String date = scan.next();
		ExfBoard board = new ExfBoard(0, 0, title, contents, date, writer);
		
		return board;
	}
	public static void inputStudent(Scanner scan,List<ExfBoard> list) {
		ExfBoard board = inputStudent(scan);
		list.add(board);
	}
	public static void printBoardList(List<ExfBoard> list) {
		Iterator<ExfBoard> it = list.iterator();
		while(it.hasNext()) {
			ExfBoard tmp = it.next();
			System.out.println(tmp);
		}
	}
	public static void modify(int num, int views, String title, String contents, String date, String writer,Scanner scan) {
		System.out.println("수정할 게시물의 정보를 입력해주세요");
		System.out.print("게시물 번호 : ");
		num = scan.nextInt();
		ExfBoard board = new ExfBoard(num, 0, "", "", "", "");
		System.out.println("잘못된 게시물 정보는 수정할 수 없습니다.");
	}
	
}
