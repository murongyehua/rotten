package com.murongyehua.rotten.enums;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
public enum ENMsgCode {

    SUCCESS("0"),
    BUSINESS_ERROR("1"),
    SYSTEM_EXCEPTION("2"),
    NOT_LOG_IN("3"),
    SESSION_TIMEOUT("4"),
    WITHOUT_RIGHT("5"),
    CONFIG_ERROR("6");

    private String value;

    private ENMsgCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
