package com.gnw.Base;

import java.io.Serializable;

public class BasePojo<T> implements Serializable {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
