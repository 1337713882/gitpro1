package com.cn.mybatais.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.cn.mybatais.config.MyBatisUtil;
import com.cn.mybatais.dao.IBookDao;
import com.cn.mybatais.entity.Book;


public class BookDao implements IBookDao {
	
	@Override
	public List<Book> loadAll() {
		SqlSession session=MyBatisUtil.openSqlSession();
		return session.selectList("com.mapper.book.loadAll");
	}

	@Override
	public int save(Book book) {
		SqlSession session = MyBatisUtil.openSqlSession();
		int counter = 0;
		counter = session.insert("com.mapper.book.save", book);
		session.commit();
		return counter;
	}

	@Override
	public int delete(int bookId) {
		SqlSession session = MyBatisUtil.openSqlSession();
		int count = session.delete("com.mapper.book.delete",bookId);
		session.commit();
		return count;
	}

	@Override
	public int update(Book book) {
		SqlSession session = MyBatisUtil.openSqlSession();
		int count=0;
		count = session.update("com.mapper.book.update",book);
		session.commit();
		return 0;
	}

}
