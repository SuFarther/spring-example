package com.company.service.impl;

import com.company.dao.GoodsDao;
import com.company.dao.SaleDao;
import com.company.entity.Goods;
import com.company.entity.Sale;
import com.company.exception.NotEnoughException;
import com.company.service.BuyGoodsService;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName BuyGoodsServiceImpl
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月28日 16:29:29
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {

    private SaleDao saleDao;
    private GoodsDao goodsDao;

    /**
     * 记录销售信息，向sale表添加记录
     * 更新库存
     * @param goodsId 购买商品的编号
     * @param nums  购买的数量
     */
    @Override
    public void buy(Integer goodsId, Integer nums) {
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null){
            //商品不存在
            throw  new NullPointerException("商品的编号:"+goodsId+",商品不存在");
        }else if(goods.getAmount() < nums){
            //商品库存不足
            throw new NotEnoughException("商品的编号:"+goodsId+",商品库存不足");
        }


        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
