package cn.tedu.dao;

import java.util.List;

import cn.tedu.bean.User;

public interface IUserDao {
	//添加用户
	public void insertUser(User user);
	public void updateUser(User user);
	public User selectById(Integer id);
	public void deleteById(Integer id);
	//查询所有用户信息
	List<User>getAll();

}
