package D4;

public class ForReverseNumEx2 {

	public static void main(String[] args) {
		/*정수를 역순으로 출력하는 코드를 for 문으로 작성하세요.
		 * 예) 1234
		 * => 4321
		 * 반복문1 : 1234에서 일의자리 4를 콘솔에 출력, 1234를 123으로 만듬
		 * 박복문2 : 123에서 일의자리 3을 콘솔에 출력, 123을 12로 만듬
		 * 반목문3 : 12에서 일의자리 2를 콘솔에 출력, 12를 1로 만듬
		 * 반복문4 : 1에서 일의자리 1을 콘솔에 출력, 1을 0으로 만듬
		 * 반목문 종료
		 * 반복횟수 : num가 0이 아닐때까지
		 * 규칙성  : num를 10으로 나눈 나머지를 출력
		 * 		    num를 10으로 나눈 몫을 num에 저장
		 * */
		int num = 1234;
		for(;num != 0 ;) {
			System.out.print(num % 10);
			num = num / 10; //1
		}
			
	}
}