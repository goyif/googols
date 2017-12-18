package com.googol.chen.login.interceptor;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.PropertyException;


import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.ExecutorException;
import org.apache.ibatis.executor.statement.BaseStatementHandler;
import org.apache.ibatis.executor.statement.PreparedStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;

import com.googol.chen.login.util.ReflectHelper;





/**
*@author xingxing
*@version 
*@time 2017年11月16日 下午1:25:07 
*class explain：
*/

@Intercepts({@Signature(type=StatementHandler.class,method="prepare",args={Connection.class})})
public class MybatisInterceptor  implements Interceptor {
	String dialect;
	@Override
	public Object intercept(Invocation xing) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("intercept---intercept---intercept");
		RoutingStatementHandler rsh=(RoutingStatementHandler)xing.getTarget();
		System.out.println("执行的方法："+rsh.getBoundSql().getSql());
		BaseStatementHandler delegate = (BaseStatementHandler) ReflectHelper.getValueByFieldName(rsh, "delegate");
		MappedStatement mappedStatement = (MappedStatement) ReflectHelper.getValueByFieldName(delegate, "mappedStatement");	
		String id=mappedStatement.getId().toString();
		System.out.println("这是我获取的xml执行的id："+id);
		if(id.equals("com.svse.user.Dao.userMapper.myqueall"))
		{
			BoundSql boundSql = delegate.getBoundSql();
			Object parameterObject = boundSql.getParameterObject();
			ReflectHelper.setValueByFieldName(boundSql, "sql", "select * from T_USER"); 
		}
	return xing.proceed();
	}

	@Override
	public Object plugin(Object arg0) {
		System.out.println("plugin---plugin---plugin");
		return Plugin.wrap(arg0,this);
	}

	@Override
	public void setProperties(Properties arg0) {
		// TODO Auto-generated method stub
		dialect=arg0.get("dialect").toString();
		System.out.println("dialect:"+dialect);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Override
	public Object intercept(Invocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("神操作！"+dialect);
		System.out.println("我准备尝试拦截SQL语句！");
		RoutingStatementHandler rsh=(RoutingStatementHandler) arg0.getTarget();
		String str=rsh.getBoundSql().getSql().toString();
		System.out.println("输出SQL:"+str);
		BaseStatementHandler delegate = (BaseStatementHandler) ReflectHelper.getValueByFieldName(rsh, "delegate");
		MappedStatement mappedStatement = (MappedStatement) ReflectHelper.getValueByFieldName(delegate, "mappedStatement");	
		String id=mappedStatement.getId().toString();
		System.out.println("这是我获取的xml执行的id："+id);
		BoundSql boundSql = delegate.getBoundSql();
		Object parameterObject = boundSql.getParameterObject();
		String fhsql = boundSql.getSql();
		Connection connection = (Connection) arg0.getArgs()[0]; //这个是获取的连接
		System.out.println("这里我准备更改SQL语句是：select * from t_user");
		String changeSql="select * from t_user";//把Sql改为了查询所有！
		ReflectHelper.setValueByFieldName(boundSql, "sql", "select * from t_user"); 
		return arg0.proceed();
	}

	@Override
	public Object plugin(Object arg0) {
		System.out.println("plugin");
		System.out.println("pluginpluginpluginpluginpluginpluginplugin");
		return Plugin.wrap(arg0, this);
	}

	@Override
	public void setProperties(Properties arg0) {
		dialect=arg0.getProperty("dialect");
		System.out.println("dialect:"+dialect);
	}

	*/
}