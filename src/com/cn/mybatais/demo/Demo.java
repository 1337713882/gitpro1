package com.cn.mybatais.demo;

import com.cn.mybatais.dao.IBookDao;
import com.cn.mybatais.dao.impl.BookDao;
import com.cn.mybatais.entity.Book;

public class Demo {

	public static void main(String[] args) {
		IBookDao bookDao = new BookDao();
		
		bookDao.loadAll().forEach(System.out::println);
//		Book book = new Book();
//		book.setBookName("javaScript�̳�");
//		book.setBookAuthor("����");
//		book.setBookPrice(63.6);
//		book.setBookInfo("�ű���̳̽�");
//		
//		int count = bookDao.save(book);
//		System.out.println(count);
		
//		int count = bookDao.delete(65);
//		System.out.println(count);
		
//		Book book = new Book();
//		book.setBookId(66);
//		book.setBookName("Tomcatѧϰ");
//		book.setBookAuthor("���");
//		book.setBookPrice(66.6);
//		book.setBookInfo("������ѧϰ����");
//		
//		int count = bookDao.update(book);
//		System.out.println(count);
	}

}
