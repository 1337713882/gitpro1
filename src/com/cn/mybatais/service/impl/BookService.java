package com.cn.mybatais.service.impl;

import java.util.List;

import com.cn.mybatais.dao.IBookDao;
import com.cn.mybatais.dao.impl.BookDao;
import com.cn.mybatais.entity.Book;
import com.cn.mybatais.service.IBookService;

public class BookService implements IBookService {
	
	IBookDao bookDao = new BookDao();
	@Override
	public List<Book> loadAll() {
		
		return bookDao.loadAll();
	}

	@Override
	public int save(Book book) {
		
		return bookDao.save(book);
	}

	@Override
	public int delete(int bookId) {
		
		return bookDao.delete(bookId);
	}

	@Override
	public int update(Book book) {
	
		return bookDao.update(book);
	}

}
