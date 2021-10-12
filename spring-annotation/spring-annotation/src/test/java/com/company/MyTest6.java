package com.company;

import com.company.entity6.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @ClassName MyTest1
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月12日 16:21:21
 */
public class MyTest6 {
    @Test
    public  void testComponent(){
        String config  = "application.xml";
        ApplicationContext acx = new ClassPathXmlApplicationContext(config);
        Student student = (Student) acx.getBean("student6");
        System.out.println("student="+student);
    }
}
