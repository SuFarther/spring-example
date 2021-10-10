package com.company.di02;

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

    public void setName(String name) {
        System.out.println("setName:"+name);
        this.name = name;
    }

    public void setAge(Integer age) {
        System.out.println("setAge:"+age);
        this.age = age;
    }

    public void setSchool(School school) {
        System.out.println("setSchool:"+school);
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
