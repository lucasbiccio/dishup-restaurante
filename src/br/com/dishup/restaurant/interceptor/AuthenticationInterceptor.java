package br.com.dishup.restaurant.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticationInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String uri = request.getRequestURI();
		if(uri.contains("login") || uri.contains("welcome"))
			return true;
		if(request.getSession().getAttribute("user") != null){
			return true;
		}
		response.sendRedirect("welcome");
		return false;
	}
}
