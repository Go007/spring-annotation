package com.hong.test;

import com.hong.bean.Red;
import com.hong.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {

	@Test
	public void test01(){
		//1������ioc����
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
		System.out.println("�����������...");
		applicationContext.getBean("car");
		Red red = (Red) applicationContext.getBean("red");
		//�ر�����
		applicationContext.close();
	}

}
