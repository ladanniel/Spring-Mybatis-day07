package cn.tedu.dao;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.tedu.bean.SqlSessionUtil;
import cn.tedu.bean.User;
public class UserDao implements IUserDao{

	public void insertUser(User user) {
	
		SqlSession session = SqlSessionUtil.getSession();
		//第一个参数：nameSpace.id
		session.insert("userDao.insertUser", user);
		//mybatis默认手动提交事务
		session.commit();
		//关闭
		session.close();
	
	}

	public void updateUser(User user) {
		SqlSession session = SqlSessionUtil.getSession();
		session.update("userDao.updateUser",user);
		session.commit();
		session.close();
	}

	public User selectById(Integer id) {
		SqlSession session = SqlSessionUtil.getSession();
	     User user = session.selectOne("userDao.selectById", id);//为了关闭sql,所以定义一个变量来接收查询结果并返回结果
	     session.commit();;
	     session.close();
		return user;
		
	}

	public void deleteById(Integer id) {
		SqlSession session = SqlSessionUtil.getSession();
		session.delete("userDao.deleteUser",id);
		session.commit();
		session.close();
		
		
	}

	public List<User> getAll() {
		SqlSession session = SqlSessionUtil.getSession();
		List<User> list = session.selectList("userDao.getAll");
		session.commit();
		session.close();
		return list;
	}

}
