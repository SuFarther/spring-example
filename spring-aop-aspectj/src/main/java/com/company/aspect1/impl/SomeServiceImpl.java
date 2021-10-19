package com.company.aspect1.impl;

import com.company.aspect1.SomeService;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SomeServiceImpl
 * @company 公司
 * @Description 目标类
 * @createTime 2021年10月17日 14:44:44
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSomething(String name,Integer age) {
        //给doSome方法增加一个功能,在doSome()执行之前,输出方法的执行时间
        System.out.println("===目标方法doSome()====");
    }


    @Override
    public String doOther(String name,Integer age) {
        //给doSome方法增加一个功能,在doSome()执行之前,输出方法的执行时间
        System.out.println("===目标方法doOther()====");
        return "abc";
    }

    @Override
    public String doFirst(String name, Integer age) {
        System.out.println("===目标方法doFirst()====");
        return "doFirst";
    }

    @Override
    public void doSecond() {
        System.out.println("===目标方法doSecond()===="+ (10/0));
    }

    @Override
    public void doThird() {
        System.out.println("===目标方法doThird()====");
    }


}
