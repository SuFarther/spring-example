package com.company.di06;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName School
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月10日 14:45:45
 */
public class School {
    private String name;
    private String address;


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
