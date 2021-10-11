package com.company;



import com.company.di05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @ClassName MyStudentTest2
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月10日 14:52:52
 */
public class MyStudentTest5 {
    @Test
    public  void testStudent01(){
        String config = "di05/application.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
       Student student = (Student) application.getBean("student5");
        System.out.println("student的对象"+student);
    }
}
