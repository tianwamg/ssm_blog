package cn.com.bean;

/**
 * �����û�ʵ����
 * @author Ranger
 *
 */
public class User {

	private String account; // �û��˻�
	private String sname; // �û�����
	private String spassword; // �û�����
	private String identity; // �û����

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
