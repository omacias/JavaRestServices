package com.service.rest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RestInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler){
		response.setContentType("application/json;charset=UTF-8");
		response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE, HEAD, OPTIONS");
        //response.setHeader("Access-Control-Allow-Headers", "Authorization, Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers");
		return true;
	}
	
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView){		
		// nothing to do here
	}

}
