package D4;

public class ForReverseNumEx1 {

	public static void main(String[] args) {
		/*5부터 1까지 출력하는 예제를 for문을 이용하여 작성하세요
		 * 방법1.
		 * 반복횟수: i는 5부터 1까지 1씩 감소
		 * 실행문 : i를 출력
		 * 방법2 
		 * 반복횟수 : i는 0부터 5보다 작을떄까지 1씩 증가
		 * 실행문 : 5-i를 출력*/
		
		int i;
		for(i = 5 ;i >= 1 ;i=i-1 ) 
			System.out.print(i +" " );
	
		
		//방법2
		for(i = 0 ; i < 5 ; i++ )
		System.out.print(5 - i + " ");
	

	}

}
