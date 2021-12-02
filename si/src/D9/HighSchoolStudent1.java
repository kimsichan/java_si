package D9;

public class HighSchoolStudent1 {
	public static void main(String[] args) {
		HighSchoolStudent hss = new HighSchoolStudent(1, 1, 1, "그린고등학교", "홍길동");
		hss.prinIntfo();
	}
	/*고등학교 학생 정보를 관리하는 HighScoolStudent 클래스를 생성하세요. HighScoolStudent 클래스를 이용하여 
	 * 그린고등학교 1학년 1반 1번 홍길동 학생의 객체를 생성자를 이용하여 생성한 후, 학생 정보를 출력하는 코드를 main 메소드에 작성하여 테스트하세요.
	- 고등학교 학생 클래스
	 - 멤버변수 : 학교명, 학년, 반, 번호, 이름
	 - 멤버메소드 : 학생 정보 출력 기능
	 - 생성자*/
	
}
class HighSchoolStudent{
	private int grade, classNum, num;
	private String schoolName, name;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HighSchoolStudent() {}
	
	public HighSchoolStudent(int grade, int classNum, int num, String schoolName, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.schoolName = schoolName;
		this.name = name;
	}
	public void prinIntfo(){
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("학교명 : " + schoolName);
		System.out.println("이름 : " + name);
		
	}

}