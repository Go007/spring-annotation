package com.hong.config;

import com.hong.bean.Color;
import com.hong.bean.Person;
import com.hong.condition.LinuxCondition;
import com.hong.condition.MyImportBeanDefinitionRegistrar;
import com.hong.condition.MyImportSelector;
import com.hong.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//�������ͳһ���á����㵱ǰ����������������õ�����beanע�������Ч��
@Configuration
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})  // ���������idĬ���������ȫ����
public class MainConfig2 {

	@Conditional({WindowsCondition.class})
	@Bean("bill")
	public Person person01(){
		return new Person("Bill Gates",62);
	}

	@Conditional(LinuxCondition.class)
	@Bean("linus")
	public Person person02(){
		return new Person("linus", 48);
	}
}
