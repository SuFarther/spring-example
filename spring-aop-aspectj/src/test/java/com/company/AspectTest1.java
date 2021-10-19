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


    @Test
    public void testAspect2(){
        String config = "applicationContext.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        SomeService proxy = (SomeService) application.getBean("someService");
        //通过代理对象执行方法,实现目标方法执行时,增强了功能
        String str = proxy.doOther("zhangsan", 20);
    }


    @Test
    public void testAspect3(){
        String config = "applicationContext.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        SomeService proxy = (SomeService) application.getBean("someService");
        String str = proxy.doFirst("zhangsan", 22);
        System.out.println("str ==" +str);
    }

    @Test
    public void testAspect4(){
        String config = "applicationContext.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        SomeService proxy = (SomeService) application.getBean("someService");
        proxy.doSecond();
    }

    @Test
    public void testAspect5(){
        String config = "applicationContext.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        SomeService proxy = (SomeService) application.getBean("someService");
        proxy.doThird();
    }

}
