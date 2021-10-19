package com.company.aspect1;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SomeService
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月17日 14:44:44
 */
public interface SomeService {

    /**
     * 前置通知,做什么事
     * @param name
     * @param age
     */
    void doSomething(String name,Integer age);

    /**
     * 后置通知,做其他事
     * @param name
     * @param age
     */
    String doOther(String name,Integer age);

    /**
     * 环绕通知,做的第一件事
     * @param name
     * @param age
     * @return
     */
    String doFirst(String name,Integer age);


    /**
     *
     * 异常通知
     */
    void doSecond();


    /**
     *
     * 最终通知
     */
    void doThird();

}
