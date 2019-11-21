package com.gnw.Pojo.UserPojo;

import com.gnw.Base.BasePojo;

import java.io.Serializable;

public class DetailsImg extends BasePojo<DetailsImg> implements Serializable {
    private String detaImgId;

    private String prodDetailsId;

    private String detaImgUrl;

    private String spare1;

    private String spare2;

    private String spare3;

    public String getDetaImgId() {
        return detaImgId;
    }

    public void setDetaImgId(String detaImgId) {
        this.detaImgId = detaImgId == null ? null : detaImgId.trim();
    }

    public String getProdDetailsId() {
        return prodDetailsId;
    }

    public void setProdDetailsId(String prodDetailsId) {
        this.prodDetailsId = prodDetailsId == null ? null : prodDetailsId.trim();
    }

    public String getDetaImgUrl() {
        return detaImgUrl;
    }

    public void setDetaImgUrl(String detaImgUrl) {
        this.detaImgUrl = detaImgUrl == null ? null : detaImgUrl.trim();
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