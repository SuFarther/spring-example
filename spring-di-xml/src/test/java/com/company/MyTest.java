package com.company;

import com.company.di01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @version 1.0
 * @ClassName MyTest
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月10日 13:27:27
 */
public class MyTest {

    @Test
    public void testStudent(){
        String config = "di01/application.xml";
        ApplicationContext  application = new ClassPathXmlApplicationContext(config);
        Student student = (Student)application.getBean("student");
        System.out.println("student的对象"+student);

        Date date = (Date) application.getBean("date");
        System.out.println("Date的对象"+date);
    }

}
