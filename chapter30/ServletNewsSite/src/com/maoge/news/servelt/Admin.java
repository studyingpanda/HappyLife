package com.maoge.news.servelt;

/**
 * 管理员模型
 * @author maoge
 * @date 2019-12-01
 */
public class Admin {
	/**
	 * 管理员登录名
	 */
	private String loginName;
	/**
	 * 管理员登录密码
	 */
	private String loginPassword;
	/**
	 * 管理员部门名称
	 */
	private String departmentName;

	// 省略get set
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
