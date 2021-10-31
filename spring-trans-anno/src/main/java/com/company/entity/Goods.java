package com.company.entity;

/**
 * @author 苏东坡
 * @version 1.0
 * @ClassName Goods
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月28日 15:50:50
 */
public class Goods {
    private Integer id;
    private String name;
    private Integer amount;
    private Float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
