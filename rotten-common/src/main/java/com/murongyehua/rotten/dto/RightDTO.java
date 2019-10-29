package com.murongyehua.rotten.dto;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liul
 * @version 1.0 2019/10/28
 */
@Data
public class RightDTO implements Serializable {
    private static final long serialVersionUID = -7820407470267534581L;

    private String urid;

    private String userId;

    private String projectId;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private Integer version;

    private String currentUserId;
}
