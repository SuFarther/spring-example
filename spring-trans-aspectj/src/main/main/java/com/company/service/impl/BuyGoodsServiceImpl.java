package com.company.service.impl;

import com.company.dao.GoodsDao;
import com.company.dao.SaleDao;
import com.company.entity.Goods;
import com.company.entity.Sale;
import com.company.exception.NotEnoughException;
import com.company.service.BuyGoodsService;
import org.springframework.transaction.annotation.Transactional;

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


    public void addSale(){}
    public void addGoods(){}

    public void modifyGoods(){}
    public void modifySale(){}

    public void removeGoods(){}
    public void removeSalÿ(){}

    public void queryGoods(){}
    public void searchSale(){}




    /**
     *
     * rollbackFor:表示发生指定的异常一定回滚.
     *   处理逻辑是：
     *     1) spring框架会首先检查方法抛出的异常是不是在rollbackFor的属性值中
     *         如果异常在rollbackFor列表中，不管是什么类型的异常，一定回滚。
     *     2) 如果你的抛出的异常不在rollbackFor列表中，spring会判断异常是不是RuntimeException,
     *         如果是一定回滚。
     *
     *        @Transactional(
     *             propagation = Propagation.REQUIRED,
     *             isolation = Isolation.DEFAULT,
     *             readOnly = false,
     *             rollbackFor = {
     *                     NullPointerException.class,  NotEnoughException.class
     *             }
     *     )
     **/


    /**
     * 记录销售信息，向sale表添加记录
     * 更新库存
     * 使用的是事务控制的默认值， 默认的传播行为是REQUIRED，默认的隔离级别DEFAULT
     * 默认抛出运行时异常，回滚事务。
     * @param goodsId 购买商品的编号
     * @param nums  购买的数量
     */

    @Transactional(rollbackFor = {NullPointerException.class,NotEnoughException.class})
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
