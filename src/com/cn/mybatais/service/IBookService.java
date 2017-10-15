package com.cn.mybatais.service;

import java.util.List;

import com.cn.mybatais.entity.Book;

public interface IBookService {
	public List<Book> loadAll();
	public int save(Book book);
	public int delete(int bookId);
	public int update(Book book);
}
