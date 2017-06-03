package cn.com.dao;

import java.util.List;

import cn.com.bean.User;

public interface IUserDao {

	//public User getUser(String account,String spassword);
	
	public List<User> findUser();
}
