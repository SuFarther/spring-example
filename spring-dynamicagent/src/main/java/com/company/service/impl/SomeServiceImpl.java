package com.company.service.impl;

import com.company.service.SomeService;
import com.company.util.ServiceTools;


/**
 *
 * @author 苏东坡
 * @version 1.0
 * @ClassName SomeServiceImpl
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月14日 14:33:33
 */
public class SomeServiceImpl  implements SomeService {
    @Override
    public void doSome() {
//        ServiceTools.getTime();
        System.out.println("执行了doSome方法");
        ServiceTools.getAffair();
    }

    @Override
    public void doOther() {
//        ServiceTools.getAffair();
        System.out.println("执行了doOther方法");
        ServiceTools.getAffair();
    }
}
