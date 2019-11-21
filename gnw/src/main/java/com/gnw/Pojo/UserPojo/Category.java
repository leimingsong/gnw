package com.gnw.Pojo.UserPojo;

import com.gnw.Base.BasePojo;

import java.io.Serializable;

public class Category extends BasePojo<Category> implements Serializable {
    private String cateId;

    private String parCateId;

    private String cateName;

    private String cateStatus;

    private String spare1;

    private String spare2;

    private String spare3;

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId == null ? null : cateId.trim();
    }

    public String getParCateId() {
        return parCateId;
    }

    public void setParCateId(String parCateId) {
        this.parCateId = parCateId == null ? null : parCateId.trim();
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public String getCateStatus() {
        return cateStatus;
    }

    public void setCateStatus(String cateStatus) {
        this.cateStatus = cateStatus == null ? null : cateStatus.trim();
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