package com.jk.pojo;

import java.io.Serializable;

public class ReGoods  implements Serializable {
    private static final long serialVersionUID = 2644444434334067787L;
    private Integer goodsId;
    private Integer retype;
    private String reName;
    private String unit;
    private Integer count;
    private Integer orderId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getRetype() {
        return retype;
    }

    public void setRetype(Integer retype) {
        this.retype = retype;
    }

    public String getReName() {
        return reName;
    }

    public void setReName(String reName) {
        this.reName = reName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
