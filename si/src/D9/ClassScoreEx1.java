package D9;

public class ClassScoreEx1 {

	public static void main(String[] args) {
	/* 국어, 영어, 수학 성적을 관리하기 위한 클래스를 만들고,
	 * 학생 5명의 성적을 관리하기 위한 배열을 만드세요.*/
		Score score[]=new Score[5];
		for(int i = 0 ; i < score.length; i++) {
			score[i] = new Score();
		}
		for(Score tmp : score) {
			tmp.prinInfo();
		}
	}

}
/**/
class Score{
	//1.멤버변수
	private int kor,eng,math;
	private String name;
	
	//2. getter와 setter
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//기본 생성자
	public Score() {}
	//생성자 오버로딩
	public Score(int kor, int eng, int math, String name) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}
	//학생 정보를 출력하는 메소드
	public void prinInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
	}
	
}
