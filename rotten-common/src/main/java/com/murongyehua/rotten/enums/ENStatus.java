package com.murongyehua.rotten.enums;

/**
 * @author liul
 * @version 1.0 2019/10/28
 */
public enum ENStatus {
    ACTIVE("1"),
    DELETE("2");

    private String value;

    private ENStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
