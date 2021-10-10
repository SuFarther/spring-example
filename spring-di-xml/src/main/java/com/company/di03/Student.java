package com.company.di03;

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

    /**
     * 声明一个引用类型的变量
     */
    private  School school;

    public Student(){
        System.out.println("Student无参构造方法");
    }


    /**
     * 创建有参构造方法
     * @param myName
     * @param myAge
     * @param mySchool
     */
    public Student(String myName, Integer myAge, School mySchool) {
        System.out.println("=====Student有参构造方法====");
        //属性赋值
        this.name = myName;
        this.age = myAge;
        this.school = mySchool;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
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
