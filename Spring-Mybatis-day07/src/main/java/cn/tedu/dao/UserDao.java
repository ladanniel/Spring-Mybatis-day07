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
		//��һ��������nameSpace.id
		session.insert("userDao.insertUser", user);
		//mybatisĬ���ֶ��ύ����
		session.commit();
		//�ر�
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
	     User user = session.selectOne("userDao.selectById", id);//Ϊ�˹ر�sql,���Զ���һ�����������ղ�ѯ��������ؽ��
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
