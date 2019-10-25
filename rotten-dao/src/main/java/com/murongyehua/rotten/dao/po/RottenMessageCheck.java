package com.murongyehua.rotten.dao.po;

import java.io.Serializable;
import java.util.Date;

/**
 * rotten_message_check
 * @author 
 */
public class RottenMessageCheck implements Serializable {
    private String urid;

    private String caseId;

    private String fieldCheck;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private Integer version;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getFieldCheck() {
        return fieldCheck;
    }

    public void setFieldCheck(String fieldCheck) {
        this.fieldCheck = fieldCheck;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}