package com.company;

import com.company.aspect2.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @ClassName AspectTest1
 * @company 公司
 * @Description 没有接口是cglib代理
 * @createTime 2021年10月17日 15:13:13
 */
public class AspectTest2 {

    @Test
    public void testAspect7Cglib(){
        String config = "applicationContext.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(config);
        //从容器中获取对象
        SomeServiceImpl proxy = (SomeServiceImpl) application.getBean("someService2");

        /**
         * 目标类没有接口，使用cglib动态代理， spring框架会自动应用cglib
         * com.bjpowernode.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$575c8b90
         */
        System.out.println("proxy:"+proxy.getClass().getName());
        proxy.doThird();
    }


}
