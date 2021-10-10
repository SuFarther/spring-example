package com.company;


import com.company.di02.School;
import com.company.di02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @version 1.0
 * @ClassName MyStudentTest2
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月10日 14:52:52
 */
public class MyStudentTest2 {
    @Test
    public  void testStudent01(){
        Student student = new Student();
        student.setName("王五");
        student.setAge(19);
        School school = new School();
        school.setName("希望小学");
        school.setAddress("北京二环路");
        student.setSchool(school);
        System.out.println("Student的值:"+student);
    }


    @Test
    public void testStudent02(){
        String config = "di02/application.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        Student student = (Student) application.getBean("student2");
        System.out.println("student的对象"+student);

    }
}
