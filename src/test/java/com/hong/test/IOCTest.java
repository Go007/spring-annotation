package com.hong.test;

import com.hong.bean.Color;
import com.hong.bean.Person;
import com.hong.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @Description:
 * @Author wanghong
 * @Date 2020/8/5 11:09
 * @Version V1.0
 **/
public class IOCTest {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void testImport(){
        printBeans(applicationContext);
      //  Color bean = applicationContext.getBean(Color.class);
     //   System.out.println(bean);

        //工厂Bean获取的是调用getObject创建的对象
        Object bean2 = applicationContext.getBean("colorFactoryBean");
        Object bean3 = applicationContext.getBean("colorFactoryBean");
        System.out.println("bean的类型："+ bean2.getClass());
        System.out.println(bean2 == bean3);

        Object bean4 = applicationContext.getBean("&colorFactoryBean");
        System.out.println(bean4.getClass());
    }

    @Test
    public void test03(){
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        //动态获取环境变量的值；Windows 10
        String property = environment.getProperty("os.name");
        System.out.println(property);
        for (String name : namesForType) {
            System.out.println(name);
        }

        Map<String, Person> persons = applicationContext.getBeansOfType(Person.class);
        System.out.println(persons);

    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext){
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
