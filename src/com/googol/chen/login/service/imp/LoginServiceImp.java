package com.googol.chen.login.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.googol.chen.login.dao.LoginDao;
import com.googol.chen.login.entity.User;
import com.googol.chen.login.service.LoginService;
@Service("loginService")
public class LoginServiceImp implements LoginService{
    
	
	@Autowired
     LoginDao loginDao;

	@Override
	public Integer login(User user) {
		
		return loginDao.login(user).size();
	}

	
 
}
