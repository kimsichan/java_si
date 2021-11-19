package D18;

import java.util.*;

public class ExaCalenderEx1 {

	public static void main(String[] args) {
		//현재 시간을 기준으로 객체를 만들어서 넘겨줌  
		//Calendar는 요일, 년, 월, 일 정보들을 쉽게 확인 할 때 사용
		//Calendar는 외부에서 객체를 만들지 못하고, 내부적으로 만들어서 주기 떄문에 
		//new 연산자가 아닌 getInstance() 메소드를 이용해야 한다
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		/* Calendar의 get 메소드를 이용하여 년, 월, 일, 요일 등의 정보들을 가져올 수 있다
		 * */
		cal.set(Calendar.HOUR_OF_DAY, 14);
		System.out.println(cal.get(Calendar.YEAR)+ "년");//년도
		System.out.println(cal.get(Calendar.MONTH)+1  + "월");//월
		System.out.println(cal.get(Calendar.DATE) + "일");//일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");//요일
		System.out.println(cal.get(Calendar.HOUR) + "시");//시
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시");//시
		System.out.println(cal.get(Calendar.MINUTE) + "분");//분
		System.out.println(cal.get(Calendar.SECOND) + "초");//초
		
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2.get(Calendar.HOUR_OF_DAY) + "시");//시
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시");//시
	}

}
