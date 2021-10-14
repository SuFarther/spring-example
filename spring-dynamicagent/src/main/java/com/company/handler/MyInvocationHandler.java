package com.company.handler;

import com.company.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zairensuyi
 * @version 1.0
 * @ClassName MyInvocationHandler
 * @company 公司
 * @Description 动态代理管理日志和时间
 * @createTime 2021年10月14日 14:42:42
 */
public class MyInvocationHandler implements InvocationHandler {

    //目标对象
    private  Object target = null;

    public MyInvocationHandler(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象执行方法时，会调用执行这个invoke（）
        System.out.println("执行MyIncationHandler中的invoke()");
        System.out.println("method名称："+method.getName());
        String methodName = method.getName();
        Object res = null;

        /**
         * JoinPoint  Pointcut
         * 执行目标类的方法，通过Method类实现
         * /SomeServiceImpl.doSome()
         * 在目标方法执行之后，提交事务
         *
         */
        if("doSome".equals(methodName)){
            ServiceTools.getTime();
            res  = method.invoke(target,args);
            ServiceTools.getAffair();
        } else {
            res  = method.invoke(target,args);
        }


        /**
         * 目标方法的执行结果
         */
        return res;
    }
}
