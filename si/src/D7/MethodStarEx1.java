package D7;

public class MethodStarEx1 {

	public static void main(String[] args) {
		/* *****를 출력하는 메소드를 만들고, 호출하여 테스트해보세요
		 * *****
		 * ********
		 * -----
		 * */
		prinChar('*',5);
		prinChar('*',7);
		prinChar('-',5);

	}
	/* 기능 : 문자가 주어지면 주어진 문자를 주어진 횟수만큼 출력하는 메소드
	 * 매개변수 : 문자, 횟수 => char ch, int count
	 * 리턴타입 : 없음 => void
	 * 메소드명 : prinChar
	 * */
	public static void prinChar(char ch, int count) {
		for(int i=1; i<=count; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}
