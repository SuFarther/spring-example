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
//使用value属性,指定对象名称
//@Component(value = "student")

//省略value
//@Component("student")

//不指定对象名称,由spring提供默认名称: 类名的首字母小写
//@Component

@Component("student2")
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
