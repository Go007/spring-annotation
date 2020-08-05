package com.hong.test;


import com.hong.bean.Boss;
import com.hong.bean.Car;
import com.hong.config.MainConifgOfAutowired;
import com.hong.dao.BookDao;
import com.hong.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_Autowired {

	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);
		System.out.println("========================");
		BookService bookService = applicationContext.getBean(BookService.class);
		System.out.println(bookService);
		System.out.println("========================");
		BookDao bean = applicationContext.getBean(BookDao.class);
		System.out.println(bean);
		System.out.println("========================");
		Boss boss = applicationContext.getBean(Boss.class);
		System.out.println(boss);
		System.out.println("========================");
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);
		System.out.println("========================");
		System.out.println(applicationContext);
		applicationContext.close();
	}

}
