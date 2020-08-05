package com.hong.config;

import com.hong.bean.Color;
import com.hong.condition.MyImportBeanDefinitionRegistrar;
import com.hong.condition.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})  // 导入组件，id默认是组件的全类名
public class MainConfig2 {


}
