package com.hong.config;

import com.hong.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//������==�����ļ�
@Configuration  //����Spring����һ��������
public class MainConfig {

	//��������ע��һ��Bean;����Ϊ����ֵ�����ͣ�idĬ�����÷�������Ϊid
	@Bean("person")
	public Person person01(){
		return new Person("lisi", 20);
	}

}
