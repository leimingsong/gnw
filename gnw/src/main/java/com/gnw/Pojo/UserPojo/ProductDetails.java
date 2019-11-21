package com.gnw.Pojo.UserPojo;

import com.gnw.Base.BasePojo;

import java.io.Serializable;

public class ProductDetails extends BasePojo<ProductDetails> implements Serializable {
    private String prodDetailsId;

    private String cateId;

    private String prodDetailsName;

    private String prodDetailsComment;

    private String showImgUrl;

    private String spare1;

    private String spare2;

    private String spare3;

    public String getProdDetailsId() {
        return prodDetailsId;
    }

    public void setProdDetailsId(String prodDetailsId) {
        this.prodDetailsId = prodDetailsId == null ? null : prodDetailsId.trim();
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId == null ? null : cateId.trim();
    }

    public String getProdDetailsName() {
        return prodDetailsName;
    }

    public void setProdDetailsName(String prodDetailsName) {
        this.prodDetailsName = prodDetailsName == null ? null : prodDetailsName.trim();
    }

    public String getProdDetailsComment() {
        return prodDetailsComment;
    }

    public void setProdDetailsComment(String prodDetailsComment) {
        this.prodDetailsComment = prodDetailsComment == null ? null : prodDetailsComment.trim();
    }

    public String getShowImgUrl() {
        return showImgUrl;
    }

    public void setShowImgUrl(String showImgUrl) {
        this.showImgUrl = showImgUrl == null ? null : showImgUrl.trim();
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