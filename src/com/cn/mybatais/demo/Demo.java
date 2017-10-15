package com.cn.mybatais.demo;

import com.cn.mybatais.dao.IBookDao;
import com.cn.mybatais.dao.impl.BookDao;
import com.cn.mybatais.entity.Book;

public class Demo {

	public static void main(String[] args) {
		IBookDao bookDao = new BookDao();
		
		bookDao.loadAll().forEach(System.out::println);
//		Book book = new Book();
//		book.setBookName("javaScript教程");
//		book.setBookAuthor("张三");
//		book.setBookPrice(63.6);
//		book.setBookInfo("脚本编程教程");
//		
//		int count = bookDao.save(book);
//		System.out.println(count);
		
//		int count = bookDao.delete(65);
//		System.out.println(count);
		
//		Book book = new Book();
//		book.setBookId(66);
//		book.setBookName("Tomcat学习");
//		book.setBookAuthor("李刚");
//		book.setBookPrice(66.6);
//		book.setBookInfo("服务器学习资料");
//		
//		int count = bookDao.update(book);
//		System.out.println(count);
	}

}
