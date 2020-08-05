package com.hong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author wanghong
 * @Date 2020/8/5 10:14
 * @Version V1.0
 **/
public class MainTest {

    public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 注意查看方法调用链 debug调用栈
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        /**
         * 如果我们没有往Spring容器中添加任何类，则下面的打印信息如下：
         * org.springframework.context.annotation.internalConfigurationAnnotationProcessor
         * org.springframework.context.annotation.internalAutowiredAnnotationProcessor
         * org.springframework.context.annotation.internalCommonAnnotationProcessor
         * org.springframework.context.event.internalEventListenerProcessor
         * org.springframework.context.event.internalEventListenerFactory
         */
        for (String beanDefinitionName:beanDefinitionNames){
            System.out.println(beanDefinitionName);
        }
    }
}
