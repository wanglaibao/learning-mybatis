package com.laibao.mybatis3.simple.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author laibao wang
 * @date 2017-12-27
 * @version 1.0
 */
public class SysRole implements Serializable{
    private static final long serialVersionUID = -3583348553057600986L;

    /**
     *  自增主键
     */
    private Long id;
    /**
     *  角色名
     */
    private String roleName;
    /**
     *  有效标志
     */
    private int enabled;
    /**
     *  创建人
     */
    private int createBy;

    /**
     *  创建时间
     */
    private Date createdTime;

    /**
     *  更新时间
     */
    private Date updatedTime;

    public SysRole() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public int getCreateBy() {
        return createBy;
    }

    public void setCreateBy(int createBy) {
        this.createBy = createBy;
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
