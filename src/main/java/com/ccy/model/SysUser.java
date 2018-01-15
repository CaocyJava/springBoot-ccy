package com.ccy.model;

/**
 * @author caocy
 * @date 2017-11-29
 */
public class SysUser {

	/**
	 * 用户编码
	 */
	private String userId;
	/**
	 * 区域编码
	 */
	private String regId;
	/**
	 * 用户代码
	 */
	private String userCode;
	/**
	 * 用户账号
	 */
	private String userLoginname;
	/**
	 * 用户姓名
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String userPassword;
	/**
	 * 用户电话
	 */
	private String userPhone;
	/**
	 * 用户电子邮件
	 */
	private String userEmail;
	/**
	 * 用户备注
	 */
	private String userNote;
	/**
	 * 用户状态（0：正常  9：停用，-1：删除）
	 */
	private Long userState;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 修改时间
	 */
	private String modifyTime;
	/**
	 * 有效性
	 */
	private Long isValid;
	/**
	 * 用户级别
	 * 0：省级用户
	 * 1：集团用户
	 */
	private Long userClass;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserLoginname() {
		return userLoginname;
	}

	public void setUserLoginname(String userLoginname) {
		this.userLoginname = userLoginname;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserNote() {
		return userNote;
	}

	public void setUserNote(String userNote) {
		this.userNote = userNote;
	}

	public Long getUserState() {
		return userState;
	}

	public void setUserState(Long userState) {
		this.userState = userState;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Long getIsValid() {
		return isValid;
	}

	public void setIsValid(Long isValid) {
		this.isValid = isValid;
	}

	public Long getUserClass() {
		return userClass;
	}

	public void setUserClass(Long userClass) {
		this.userClass = userClass;
	}
}
