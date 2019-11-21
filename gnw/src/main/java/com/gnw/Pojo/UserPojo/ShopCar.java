package com.gnw.Pojo.UserPojo;

import com.gnw.Base.BasePojo;

import java.io.Serializable;

public class ShopCar extends BasePojo<ShopCar> implements Serializable {
    private String shopCarid;

    private String userId;

    private String prodId;

    private Integer count;

    private String spare1;

    private String spare2;

    private String spare3;

    public String getShopCarid() {
        return shopCarid;
    }

    public void setShopCarid(String shopCarid) {
        this.shopCarid = shopCarid == null ? null : shopCarid.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSpare1() {
        return spare1;
    }

    public void setSpare1(String spare1) {
        this.spare1 = spare1 == null ? null : spare1.trim();
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2 == null ? null : spare2.trim();
    }

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3 == null ? null : spare3.trim();
    }
}