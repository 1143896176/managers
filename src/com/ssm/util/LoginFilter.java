


package com.ssm.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.model.Admin;
import com.ssm.model.Members;

public class LoginFilter implements HandlerInterceptor {
	
	private static final String [] IGNORE_URI = {"index","login"};

	/**
	 * 该方法在整个请求完成之后执行，清理资源
	 * 该方法只在当前Interceptor的preHandle方法返回值为true时才会执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	/**
	 * 该方法在Controller调用之后执行
	 * 该方法也只在当前Interceptor的preHandle方法返回值为true时才会执行
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 该方法是进行处理器拦截用的，该方法在Controller处理前调用
	 * 该方法返回值为true拦截器才会继续执行，否则整个请求结束
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String servletPath = request.getServletPath();
		
		for(String s:IGNORE_URI){
			
			if(servletPath.contains(s)){
				
				flag=true;
				break;
			}
		}
		if(!flag){
			
			Admin admin = (Admin) request.getSession().getAttribute("admin");
			if(admin==null){
				
				request.setAttribute("message", "请先登录再访问网站");
				request.getRequestDispatcher("index.do").forward(request, response);
			}else{
				flag = true;
			}
		}
		
		
		return flag;
	} 

}