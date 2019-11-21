package com.gnw.Pojo.UserPojo;

import com.gnw.Base.BasePojo;

import java.io.Serializable;
import java.util.Date;

public class Product extends BasePojo<Product> implements Serializable {
    private String prodId;

    private String prodDetailsId;

    private String prodStatus;

    private Date updateTime;

    private String realPrice;

    private String salePrice;

    private String spare1;

    private String spare2;

    private String spare3;

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    public String getProdDetailsId() {
        return prodDetailsId;
    }

    public void setProdDetailsId(String prodDetailsId) {
        this.prodDetailsId = prodDetailsId == null ? null : prodDetailsId.trim();
    }

    public String getProdStatus() {
        return prodStatus;
    }

    public void setProdStatus(String prodStatus) {
        this.prodStatus = prodStatus == null ? null : prodStatus.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(String realPrice) {
        this.realPrice = realPrice == null ? null : realPrice.trim();
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice == null ? null : salePrice.trim();
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