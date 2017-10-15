package com.cn.mybatais.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	//SqlSession session 会话(客户端和web服务器一次会话 客户端和DB服务器一次会话) Connection
	private static SqlSessionFactory sessionFactory;
	
	static {
		try {
			//读取配置文件
			InputStream inStream=Resources.getResourceAsStream("mybatais.xml");
			//创建SqlSession的工厂的构建类
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			//通过配置文件创建SqlSession工厂
			sessionFactory=builder.build(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void rebuilderSqlSessionFactory(){
		try {
			//读取配置文件
			InputStream inStream=Resources.getResourceAsStream("mybatais.xml");
			//创建SqlSession的工厂的构建类
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			//通过配置文件创建SqlSession工厂
			sessionFactory=builder.build(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession openSqlSession() {
		if(sessionFactory==null)
			rebuilderSqlSessionFactory();
		return sessionFactory.openSession();
	}
	
	public static void closeSqlSession(SqlSession session) {
		if(session!=null) {
			session.close();
		}
	}
}
