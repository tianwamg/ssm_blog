package cn.com.bean;

/**
 * 创建用户实体类
 * @author Ranger
 *
 */
public class User {

	private String account; // 用户账户
	private String sname; // 用户姓名
	private String spassword; // 用户密码
	private String identity; // 用户身份

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

}
