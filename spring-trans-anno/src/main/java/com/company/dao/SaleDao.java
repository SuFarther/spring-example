package com.company.dao;


import com.company.entity.Sale;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName SaleDao
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月28日 16:08:08
 */
public interface SaleDao {

    /**
     * 新增销售记录
     * @param sale
     * @return
     */
    int insertSale(Sale sale);
}
