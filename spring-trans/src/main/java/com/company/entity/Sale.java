package com.company.entity;

/**
 * @author 商品表
 * @version 1.0
 * @ClassName Sale
 * @company 公司
 * @Description TODO
 * @createTime 2021年10月28日 15:48:48
 */
public class Sale {
    private Integer id;
    private Integer gid;
    private Integer nums;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", gid=" + gid +
                ", nums=" + nums +
                '}';
    }
}
