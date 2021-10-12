package com.company.entity4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName School
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月10日 14:45:45
 */
@Component("school")
public class School {

    @Value("北京大学")
    private String name;

    @Value("中关村")
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
