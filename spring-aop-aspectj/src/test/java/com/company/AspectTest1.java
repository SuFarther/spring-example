package com.company;

import com.company.aspect1.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @ClassName AspectTest1
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月17日 15:13:13
 */
public class AspectTest1 {

    @Test
    public void testAspect1(){
        String config = "applicationContext.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        SomeService proxy = (SomeService) application.getBean("someService");
        //通过代理对象执行方法,实现目标方法执行时,增强了功能
        proxy.doSomething("lili",29);

    }
}
