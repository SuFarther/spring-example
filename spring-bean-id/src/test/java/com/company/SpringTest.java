package com.company;

import com.company.service.SomeService;
import com.company.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.util.Date;


/**
 * @version 1.0
 * @ClassName SpringTest
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月09日 16:51:51
 */
public class SpringTest {

    @Test
    public void TestSomeService(){
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }


    /**
     * spring默认创建对象的时间,在创建spring容器时,会创建配置文件中的所有对象
     * spring创建对象,默认调用的是无参构造方法
     */
    @Test
    public void TestSpringBeans(){
        String config = "spring-beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) applicationContext.getBean("someService");
        someService.doSome();
    }


    /**
     * 获取Spring中java对象的信息
     */
    @Test
    public void TestSpringBeans2(){
        String config = "spring-beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //使用spring提供的方法,获取容器中定义的对象的数量
        int nums = applicationContext.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量："+nums);
        //容器中每个定义的对象的名称
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name:names){
            System.out.println(name);
        }
    }


    /**
     * 获取非自定义的类
     */
    @Test
    public void TestDate(){
        String config = "spring-beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //使用getBean
        Date date = (Date) applicationContext.getBean("date");
        System.out.println("Date:"+date);
    }
}
