package com.gnw.Pojo.UserPojo;

import com.gnw.Base.BasePojo;

import java.io.Serializable;

public class Carousel extends BasePojo<Carousel> implements Serializable {
    private String caroId;

    private String caroUrl;

    private String caroStatus;

    private String spare1;

    private String spare2;

    private String spare3;

    public String getCaroId() {
        return caroId;
    }

    public void setCaroId(String caroId) {
        this.caroId = caroId == null ? null : caroId.trim();
    }

    public String getCaroUrl() {
        return caroUrl;
    }

    public void setCaroUrl(String caroUrl) {
        this.caroUrl = caroUrl == null ? null : caroUrl.trim();
    }

    public String getCaroStatus() {
        return caroStatus;
    }

    public void setCaroStatus(String caroStatus) {
        this.caroStatus = caroStatus == null ? null : caroStatus.trim();
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