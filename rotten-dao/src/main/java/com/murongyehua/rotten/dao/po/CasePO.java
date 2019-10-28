package com.murongyehua.rotten.dao.po;

import java.io.Serializable;
import java.util.Date;

/**
 * rotten_case
 * @author 
 */
public class CasePO implements Serializable {
    private String urid;

    private String caseNo;

    private String caseRemark;

    private String projectId;

    private String checkReturnMessage;

    private String checkDatabaseInfo;

    private String caseClassId;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String createUser;

    private String updateUser;

    private String version;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getCaseRemark() {
        return caseRemark;
    }

    public void setCaseRemark(String caseRemark) {
        this.caseRemark = caseRemark;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCheckReturnMessage() {
        return checkReturnMessage;
    }

    public void setCheckReturnMessage(String checkReturnMessage) {
        this.checkReturnMessage = checkReturnMessage;
    }

    public String getCheckDatabaseInfo() {
        return checkDatabaseInfo;
    }

    public void setCheckDatabaseInfo(String checkDatabaseInfo) {
        this.checkDatabaseInfo = checkDatabaseInfo;
    }

    public String getCaseClassId() {
        return caseClassId;
    }

    public void setCaseClassId(String caseClassId) {
        this.caseClassId = caseClassId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}