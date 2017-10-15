package com.cn.mybatais.dao;

import java.util.List;

import com.cn.mybatais.entity.Book;

public interface IBookDao {
	public List<Book> loadAll();
	public int save(Book book);
	public int delete(int bookId);
	public int update(Book book);
}
