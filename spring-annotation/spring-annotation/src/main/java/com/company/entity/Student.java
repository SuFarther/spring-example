package com.company.entity;

import org.springframework.stereotype.Component;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Student
 * @company 公司
 * @Description 主键扫描
 * @createTime 2021年10月12日 16:13:13
 */
@Component(value = "student")
public class Student {
    private String name;
    private Integer age;

    public Student(){

    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
