package com.googol.chen.login.dao.imp;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googol.chen.login.dao.LoginDao;
import com.googol.chen.login.entity.User;
@Repository
public class loginDaoImp implements LoginDao{
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Override
	public List login( User user) {
		
		return sqlSessionFactory.openSession().selectList("login", user);
	}
	
	


}
