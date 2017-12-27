package com.laibao.mybatis3.simple.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author laibao wang
 * @date 2017-12-26
 * @version 1.0
 */
public class SysPrivilege implements Serializable{
    private static final long serialVersionUID = -2684734810607641661L;

    private long id;

    private String privilegeName;

    private String privilegeUrl;

    private Date createdTime;

    private Date updatedTime;

    public SysPrivilege() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
