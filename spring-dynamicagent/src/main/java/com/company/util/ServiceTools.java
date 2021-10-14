package com.company.util;

import java.util.Date;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SpringTools
 * @company 公司
 * @Description SpringTools主要封装事务的时间和执行日志
 * @createTime 2021年10月14日 14:34:34
 */
public  class ServiceTools {

    public   static void getTime(){
        System.out.println("非业务方法，方法的执行时间："+new Date());
    }


    public static  void getAffair(){
        System.out.println("非业务方法，方法执行完毕后，提交事务");
    }
}
