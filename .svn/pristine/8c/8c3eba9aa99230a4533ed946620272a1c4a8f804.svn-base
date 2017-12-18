package com.googol.chen.login.interceptor;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class LoginHandlerInterceptor implements HandlerInterceptor
{

	private final Logger logger = Logger.getLogger(LoginHandlerInterceptor.class);

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception
	{

		logger.info("================��controllerִ��֮�� ��modelandviewִ��֮��===================");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception
	{
		logger.info("================��controllerִ��֮�� ��modelandviewִ��֮ǰ===================");

	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object obj) throws Exception
	{
		if("GET".equalsIgnoreCase(request.getMethod())){  System.out.println("����GET����"); }
		logger.info("================��controllerִ��֮ǰ ��modelandviewִ��֮ǰ===================");
        HttpSession session=request.getSession();
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		logger.info("requestUri:" + request.getRequestURI());
		logger.info("contextPath:" + request.getRequestURI());
		logger.info("url:" + requestUri.substring(contextPath.length()));
		
		if(requestUri.indexOf("verify.do")>0)
		{
			return true;
		}
		if(request.getRequestURL().indexOf("login.do")>0)
		{
			return true;
		}
		
		if(session.getAttribute("companyName")!=null)
		{
			return true;
		}
		request.getRequestDispatcher("login.jsp").forward(request,response);
		return false;
	}
}
