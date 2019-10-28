package com.murongyehua.rotten.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -5820385686552971639L;
    private String userId;
    private String userName;
    private String nickName;

    public UserInfo(String userId, String userName, String nickName) {
        this.userId = userId;
        this.userName = userName;
        this.nickName = nickName;
    }
}
