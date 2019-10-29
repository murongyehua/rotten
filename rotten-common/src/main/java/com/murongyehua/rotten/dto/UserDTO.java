package com.murongyehua.rotten.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liul
 * @version 1.0 2019/10/25
 */
@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 6357878205052108853L;

    private String urid;

    private String username;

    private String nickname;

    private String password;

    private String type;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Integer version;

    private String currentUserId;

}
