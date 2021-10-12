package com.company.entity6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Student
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月12日 19:08:08
 */
@Component("student6")
public class Student {

//    @Value(value = "张飞")

    @Value("张飞")
    private String name;

//    @Value(value = "20")

    @Value("20")
    private Integer age;

//    @Resource

    @Resource(name = "school")
    private School school;

    public Student(){

    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }




    public void setName(String name) {
        this.name = name;
    }

    @Value("20")
    public void setAge(Integer age) {
        System.out.println("setAge" +age);
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
