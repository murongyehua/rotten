package com.murongyehua.rotten.enums;

/**
 * @author liul
 * @version 1.0 2019/10/28
 */
public enum ENUserType {
    NORMAL("1"),
    MANAGER("2");

    private String value;

    private ENUserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
