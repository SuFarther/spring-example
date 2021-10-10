package com.company.di01;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Student
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月10日 13:12:12
 */
public class Student {
    private String name;
    private Integer age;


    public  Student(){
        System.out.println("Student无参构造方法");
    }

    public void setName(String name) {
        System.out.println("setName:"+name);
        this.name = name;
    }

    public void setAge(Integer age) {
        System.out.println("setAge:"+age);
        this.age = age;
    }

    public void setEmail(String email) {
        System.out.println("setEmail:"+email);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
