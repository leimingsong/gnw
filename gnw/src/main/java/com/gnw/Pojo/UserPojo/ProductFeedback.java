package com.gnw.Pojo.UserPojo;

import com.gnw.Base.BasePojo;

import java.io.Serializable;
import java.util.Date;

public class ProductFeedback extends BasePojo<ProductFeedback> implements Serializable {
    private String prodFeedbackId;

    private String userId;

    private String prodId;

    private Date feedbackTime;

    private String feedbackContent;

    private String parFeedbackId;

    private String spare1;

    private String spare2;

    private String spare3;

    public String getProdFeedbackId() {
        return prodFeedbackId;
    }

    public void setProdFeedbackId(String prodFeedbackId) {
        this.prodFeedbackId = prodFeedbackId == null ? null : prodFeedbackId.trim();
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

    public Date getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Date feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
    }

    public String getParFeedbackId() {
        return parFeedbackId;
    }

    public void setParFeedbackId(String parFeedbackId) {
        this.parFeedbackId = parFeedbackId == null ? null : parFeedbackId.trim();
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