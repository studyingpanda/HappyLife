package com.maoge.news.servelt;

/**
 * ����Աģ��
 * @author maoge
 * @date 2019-12-01
 */
public class Admin {
	/**
	 * ����Ա��¼��
	 */
	private String loginName;
	/**
	 * ����Ա��¼����
	 */
	private String loginPassword;
	/**
	 * ����Ա��������
	 */
	private String departmentName;

	// ʡ��get set
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
