package cn.tedu.dao;

import java.util.List;

import cn.tedu.bean.User;

public interface IUserDao {
	//����û�
	public void insertUser(User user);
	public void updateUser(User user);
	public User selectById(Integer id);
	public void deleteById(Integer id);
	//��ѯ�����û���Ϣ
	List<User>getAll();

}
