package com.googol.chen.login.control;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.googol.chen.login.entity.User;
import com.googol.chen.login.service.LoginService;
import com.googol.chen.login.util.VerifyCodeUtil;

@Controller
public class LoginCotrol {
	
	
	
	@Autowired
    LoginService loginService;
	
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletResponse response,HttpServletRequest request,User user)throws Exception{
		//获取HttpSession 通过request获取的
		HttpSession session =request.getSession();	
		//读取session中的验证码
		String verifysession= session.getAttribute("verify")==null?"":session.getAttribute("verify").toString();
		//读取request的验证码
		String verifyrequest=request.getParameter("verify")==null?"":request.getParameter("verify").toString();
		System.out.println("verifysession:"+verifysession+", verifyrequest:"+verifyrequest);
		if(!verifysession.equals(verifyrequest)){
			return new ModelAndView("/error.jsp");
		}
		Integer a=loginService.login(user);
		if(a>0) {
			return new ModelAndView("/shoujishow.jsp");
		}
		
		return new ModelAndView("/error.jsp");
		
		
	}
	
	@RequestMapping(value="/verify")
	public void verify(HttpServletResponse response,HttpServletRequest request) throws IOException {
		//获取HttpSession 通过request获取的
		HttpSession session =request.getSession();
		//生成一个6位的随机字符串
		String VerifyCode=VerifyCodeUtil.getNumber(6);
		OutputStream output=response.getOutputStream();
		//VerifyCodeUtil.create(随机字符,宽,高,格式,输出流);
		String verifystr= VerifyCodeUtil.create(VerifyCode, 80, 50, "JPG",output);
		output.close();
		//把验证码 放入session
		session.setAttribute("verify", verifystr);
		System.out.println("验证码:"+verifystr);
	}

}