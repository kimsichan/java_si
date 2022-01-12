package kr.green.green.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GuestInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		//세션에 있는 회원정보를 가져옴. 세션에 user로 저장했기에 user를 가져옴
		HttpSession session = request.getSession();
		Object user = session.getAttribute("user");
		//세션에 회원정보가 있으면 => 로그인 했으면
		if(user != null) {
			response.sendRedirect(request.getContextPath()+"/");
			//가던 URL로 가지 말고 위에 있는 URL(메인페이지)으로 이동
			return false;
		}
		return true;
	}
}
