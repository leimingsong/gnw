package com.gnw.Pojo.UserPojo;

import com.gnw.Base.BasePojo;

import java.io.Serializable;

public class Menu extends BasePojo<Menu> implements Serializable{
    private String menuId;

    private String menuName;

    private String menuAddress;

    private String parMenuId;

    private String menuStatus;

    private String spare1;

    private String spare2;

    private String spare3;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuAddress() {
        return menuAddress;
    }

    public void setMenuAddress(String menuAddress) {
        this.menuAddress = menuAddress == null ? null : menuAddress.trim();
    }

    public String getParMenuId() {
        return parMenuId;
    }

    public void setParMenuId(String parMenuId) {
        this.parMenuId = parMenuId == null ? null : parMenuId.trim();
    }

    public String getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus == null ? null : menuStatus.trim();
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