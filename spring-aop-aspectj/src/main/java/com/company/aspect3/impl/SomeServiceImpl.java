package com.company.aspect3.impl;

import com.company.aspect3.SomeService;

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
    public void doThird() {
        System.out.println("===目标方法doThird()====");
    }


}
