package com.company;



import com.company.di03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @version 1.0
 * @ClassName MyStudentTest2
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月10日 14:52:52
 */
public class MyStudentTest3 {

    @Test
    public void testStudent02(){
        String config = "di03/application.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        Student student = (Student) application.getBean("student3");
        System.out.println("student的对象"+student);
        File file = (File) application.getBean("file");
        System.out.println("File名字:"+file.getName());
    }


    @Test
    public void testStudentIndex(){
        String config = "di03/application.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        Student student = (Student) application.getBean("student4");
        System.out.println("student的对象"+student);

    }

    @Test
    public void testStudentDeleteIndex(){
        String config = "di03/application.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        Student student = (Student) application.getBean("student5");
        System.out.println("student的对象"+student);

    }
}
