import com.company.handler.MyInvocationHandler;
import com.company.service.SomeService;
import com.company.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName MyApp
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月14日 14:52:52
 */
public class MyApp {
    public static void main(String[] args) {
      //使用jdk的Proxy创建代理对象
        //创建目标对象
        SomeService target = new SomeServiceImpl();

        //创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(target);

        //使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),handler);
        //com.sun.proxy.$Proxy0
        System.out.println("proxy======"+proxy.getClass().getName());
        //通过代理执行方法，会调用handler中的invoke（）
        proxy.doSome();
        System.out.println("==================================================");
        proxy.doOther();

    }
}
