package com.company;

import com.company.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @ClassName MyTest
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月28日 16:47:47
 */
public class MyTest {

    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        BuyGoodsService buyService = (BuyGoodsService) applicationContext.getBean("buyService");
        buyService.buy(1001,10);
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        BuyGoodsService buyService = (BuyGoodsService) applicationContext.getBean("buyService");
        buyService.buy(1005,10);
    }

    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        BuyGoodsService buyService = (BuyGoodsService) applicationContext.getBean("buyService");
        buyService.buy(1001,1000);
    }
}
