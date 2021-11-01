package com.company.service;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BuyGoodsService
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月28日 16:27:27
 */
public interface BuyGoodsService {

    /**
     * 购买商品的方法
     * @param goodsId 购买商品的编号
     * @param nums  购买的数量
     */
    void buy(Integer goodsId,Integer nums);
}
