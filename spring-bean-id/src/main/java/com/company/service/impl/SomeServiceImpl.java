package com.company.service.impl;

import com.company.service.SomeService;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SomeServiceImpl
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月09日 16:48:48
 */
public class SomeServiceImpl implements SomeService {


    public SomeServiceImpl(){
        System.out.println("SomeServiceImpl无参构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("SomeServiceImpl方法实现doSome方法");
    }
}
