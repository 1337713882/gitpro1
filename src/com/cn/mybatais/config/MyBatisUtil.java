package com.cn.mybatais.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	//SqlSession session �Ự(�ͻ��˺�web������һ�λỰ �ͻ��˺�DB������һ�λỰ) Connection
	private static SqlSessionFactory sessionFactory;
	
	static {
		try {
			//��ȡ�����ļ�
			InputStream inStream=Resources.getResourceAsStream("mybatais.xml");
			//����SqlSession�Ĺ����Ĺ�����
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			//ͨ�������ļ�����SqlSession����
			sessionFactory=builder.build(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void rebuilderSqlSessionFactory(){
		try {
			//��ȡ�����ļ�
			InputStream inStream=Resources.getResourceAsStream("mybatais.xml");
			//����SqlSession�Ĺ����Ĺ�����
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			//ͨ�������ļ�����SqlSession����
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
