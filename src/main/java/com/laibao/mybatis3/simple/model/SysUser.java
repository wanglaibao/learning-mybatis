package com.laibao.mybatis3.simple.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author  laibao wang
 * @date 2017-12-27
 * @version 1.0
 */
public class SysUser implements Serializable {
	private static final long serialVersionUID = 1182071105631508041L;

	/**
	 *	自增主键
	 */
	private long id;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 密码
	 */
	private String userPassWord;

	/**
	 * 邮箱
	 */
	private String userEmail;

	/**
	 * 简介
	 */
	private String userInfo;

	/**
	 *  创建时间
	 */
	private Date createdTime;

	/**
	 *  更新时间
	 */
	private Date updatedTime;

	public SysUser() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassWord() {
		return userPassWord;
	}

	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
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
