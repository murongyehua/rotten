package com.murongyehua.rotten.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liul
 * @version 1.0 2019/10/28
 */
@Data
public class ProjectDTO implements Serializable {

    private static final long serialVersionUID = 2716683296389859320L;

    private String urid;

    private String projectName;

    private String projectCode;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Integer version;

    private String currentUserId;
}
