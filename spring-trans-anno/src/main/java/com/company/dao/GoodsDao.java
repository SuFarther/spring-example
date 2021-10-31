package com.company.dao;

import com.company.entity.Goods;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName GoodsDao
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月28日 16:15:15
 */
public interface GoodsDao {
    /**
     * 更新库存
     * goods表示本次用购买的商品信息,id,购买数
     * @param goods
     * @return
     */
    int updateGoods(Goods goods);

    /**
     * 查询用户信息
     * @param id
     * @return
     */
    Goods selectGoods(Integer id);
}
