package cn.tedu.bean;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.tedu.dao.UserDao;

public class SqlSessionUtil {
	//��̬����������������÷���
	private static SqlSessionFactory ssf;
	static{
		//��ȡ�����ļ�
		InputStream ips = UserDao.class.getClassLoader().getResourceAsStream("SqlMapperConfig.xml");
		//�õ�session����.sqlSessionFactory�����ΪConnecionFactory��;SqlSessionFactoryBuilder()�������еģ�build������
		ssf = new SqlSessionFactoryBuilder().build(ips);
	
    	
    }
	public static SqlSession getSession(){
        
        return ssf.openSession();
	}

}
