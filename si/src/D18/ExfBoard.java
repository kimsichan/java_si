package D18;

import java.util.Scanner;

//게시글 클래스
//클래스 변수를 이용하여 게시글 번호를 관리
public class ExfBoard {
	//필요한 정보 => 멤버 변수
	int num;
	private int views;
	private String title, contents, date, writer;
	//필요한 기능 => 메소드
	
	//초기화 => 생성자
	public ExfBoard(int num, int views, String title, String contents, String date, String writer) {
		super();
		this.num = num;
		this.views = views;
		this.title = title;
		this.contents = contents;
		this.date = date;
		this.writer = writer;
	}

	


	//getter 와 setter
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getViews() {
		return views;
	}
	
	public void setViews(int views) {
		this.views = views;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContents() {
		return contents;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	//편하게 출력 => to String
	@Override
	public String toString() {
		return "ExfBoard [num=" + num + ", views=" + views + ", title=" + title + ", contents=" + contents + ", date="
				+ date + ", writer=" + writer + "]";
	}
}
