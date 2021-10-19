package com.company.aspect1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MyAspect
 * @company 公司
 * @Description 切面类
 * @Aspect: 是aspect框架中的注解
 * 作用: 表示当前类是切面类
 * 切面类: 是用来给业务方法增加功能的类,在这个类中有切面的功能代码
 * 位置: 在类的定义上面
 *
 * @createTime 2021年10月17日 14:47:47
 */
@Aspect
public class MyAspect {
    /**
     * 定义方法,方法是实现切面功能的
     * 方法的定义要求:
     * 1、公共方法 public
     * 2、方法没有返回值
     * 3、方法名称自定义
     * 4、方法可以有参数,也可以没有参数
     *   如果有参数,参数不是自定义的,有几个参数类型可以使用
     */


    /**
     * @Before 前置通知注解
     *  属性:value, 是切入点表达式,表示切面的功能执行位置
     *  位置: 在方法的上面
     *  特点:
     *   1、在目标方法之前先执行的
     *   2、不会改变目标方法的执行结果
     *   3、不会影响目标方法的执行
     */
//    @Before("execution(public void com.company.aspect1.impl.SomeServiceImpl.doSomething(String,Integer))")
//    public void myBefore(){
//        //就是你切面要执行的功能代码
//        System.out.println("前置通知,切面功能:在目标方法之前输出执行时间:"+new Date());
//    }

//    @Before("execution(void com.company.aspect1.impl.SomeServiceImpl.doSomething(String,Integer))")
//    public void myBefore(){
//        //就是你切面要执行的功能代码
//        System.out.println("前置通知,切面功能:在目标方法之前输出执行时间:"+new Date());
//    }

//    @Before("execution(* *..SomeServiceImpl.doSomething(String,Integer))")
//    public void myBefore(){
//        //就是你切面要执行的功能代码
//        System.out.println("前置通知,切面功能:在目标方法之前输出执行时间:"+new Date());
//    }
//    @Before("execution(* *..SomeServiceImpl.doSomething(..))")
//    public void myBefore(){
//        //就是你切面要执行的功能代码
//        System.out.println("前置通知,切面功能:在目标方法之前输出执行时间:"+new Date());
//    }

//    @Before("execution(* *..SomeServiceImpl.do*(..))")
//    public void myBefore(){
//        //就是你切面要执行的功能代码
//        System.out.println("前置通知,切面功能:在目标方法之前输出执行时间:"+new Date());
//    }


    //    @Before("execution(* com.company.aspect1.impl.*.*(..))")
//    public void myBefore(){
//        //就是你切面要执行的功能代码
//        System.out.println("前置通知,切面功能:在目标方法之前输出执行时间:"+new Date());
//    }
    /**
     * 指定通知方法中的参数: JoinPoint
     * JoinPoint: 业务方法,要加入切面功能的业务方法
     *    作用是: 可以在通知方法中获取方法执行时的信息,例如方法名称,方法的实参
     *    如果你的切面功能中需要用到的方法的信息,就加入JoinPoint
     *    这个JoinPoint参数的值是由框架赋予,必须是第一个位置的参数
     *
     */

    @Before("execution(public void com.company.aspect1.impl.SomeServiceImpl.doSomething(String,Integer))")
    public void myBefore(JoinPoint joinPoint){
        //获取方法的完整定义
        System.out.println("方法的签名(定义)="+joinPoint.getSignature());
        System.out.println("方法的名称="+joinPoint.getSignature().getName());
        //获取方法的实参
        Object args [] = joinPoint.getArgs();
        for (Object arg:args){
            System.out.println("参数="+arg);
        }
        //就是你切面要执行的功能代码
        System.out.println("前置通知,切面功能:在目标方法之前输出执行时间:"+new Date());
    }


    /**
     * 后置通知定义方法,方法是实现切面功能的
     * 方法的定义要求:
     * 1、公共方法 public
     * 2、方法没有返回值
     * 3、方法名字自定义
     * 4、方法有参数的,推荐是Object，参数名自定义
     */

    /**
     * @AfterReturning：后置通知
     *     属性: 1、value 切入点表达式
     *           2、returning 自定义的变量,表示目标方法的返回值的
     *            自定义变量名必须和通知方法的形参名一样
     *      位置: 在方法定义的上面
     *  特点:
     *   1、在目标方法之后执行的
     *   2、能够获取到目标方法的返回值,可以根据这个返回值做不同的处理功能
     *   Object res = doOther();
     *   3、可以修改这个返回值
     *
     *
     *   后置通知的执行
     *   Object res = doOther();
     *   参数传参: 传值,传引用
     *   myAfterReturning(res);
     * @param res
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfterReturning(JoinPoint jp,Object res){
        System.out.println("后置通知: 方法的定义"+jp.getSignature());
       //Object  res:是目标方法执行后的返回值,根据返回值做你的切面的功能处理
        System.out.println("后置通知: 在目标方法之后执行的,获取的返回值是:"+res);
    }

    /**
     * 环绕通知方法的定义格式
     * 1、public
     * 2、必须有一个返回值,推荐使用Object
     * 3、方法的名称自定义
     * 4、方法有参数,固定的参数 ProceedingJoinPoint
     */


    /**
     * @Around： 环绕通知
     *    属性: value 切入点表达式
     *    位置: 在方法的定义什么
     *  特点:
     *    1、它是功能最强的通知
     *    2、在目标方法的前和后都能增强功能
     *    3、控制目标方法是否被调用执行
     *    4、修改原来的目标方法的执行结果。 影响最后的调用结果
     *
     *   环绕通知,等同于jdk动态代理的,InvocationHandler接口
     *   
     *   参数: ProceedingJoinPoint 就等同于Method
     *         作用: 执行目标方法的
     *   返回值: 就是目标方法的执行结果,可以被修改
     *
     *   环绕通知：经常做事务,在目标方法之前前启事务,执行目标方法,在目标方法之后提交事务
     *
     * @param pjp
     * @return
     */
    @Around("execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        //获取第一个参数值
        String name="";
        //获取第一个参数值
        Object[] args = pjp.getArgs();
        if(args!=null && args.length > 1){
            Object arg = args[0];
            name = (String) arg;
        }

        //实现环绕通知
        Object result = null;
        System.out.println("环绕通知,在目标方法之前,输出时间:"+new Date());

        //1、目标方法调用
        //method.invoke();Object result = doFirst();
        //目标方法执行
        if("zhangsan".equals(name)){
            result = pjp.proceed();
        }

        System.out.println("环绕通知,在目标方法之后,提交事务");


        //修改目标方法的执行结果,影响方法最后的调用结果
        if(result != null){
            result = "Hello AspectJ AOP";
        }

        //返回目标方法的执行结果
        return result;
    }
}
