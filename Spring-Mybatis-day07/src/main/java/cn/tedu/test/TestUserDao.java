package cn.tedu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.tedu.bean.SqlSessionUtil;
import cn.tedu.bean.User;
import cn.tedu.dao.IUserDao;
import cn.tedu.dao.UserDao;

public class TestUserDao {
	
	@Test  //DML
	public void testInsertUser(){
		IUserDao userDao = new UserDao();//�ӿ�ָ������ʵ���࣬��������
		User user = new User();
		user.setUsername("�ܲ�");
		user.setPassword("123456");
		user.setPhone("15988113136");
		user.setEmail("tedu@qq.com");
		userDao.insertUser(user);
	}
	@Test   //DML
	public void testUpdateUser(){
		IUserDao userDao = new UserDao();
		User user = new User();
		user.setId(2);
		user.setUsername("�����");
		user.setPassword("00001");
		user.setPhone("13619687591");
		user.setEmail("tedu@qq.cn");
		userDao.updateUser(user);
		
	}
	@Test   //DML
	public void testDeleteUser(){
		IUserDao userdao = new UserDao();
		userdao.deleteById(3);
	}
	@Test   //DQL
	public void testSelectUser(){
		
		IUserDao userdao = new UserDao();
		System.out.println(userdao.selectById(1));
	}
	@Test
	public void testSelectAll(){
		IUserDao userdao = new UserDao();
		List<User> user = userdao.getAll();
		for(User users:user){//���ڲ���д��toString����
			System.out.println("users:"+users);
		}
	}

}
