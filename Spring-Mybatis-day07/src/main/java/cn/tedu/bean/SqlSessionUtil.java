package cn.tedu.bean;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.tedu.dao.UserDao;

public class SqlSessionUtil {
	//静态方法，是类名点调用方法
	private static SqlSessionFactory ssf;
	static{
		//读取配置文件
		InputStream ips = UserDao.class.getClassLoader().getResourceAsStream("SqlMapperConfig.xml");
		//得到session工厂.sqlSessionFactory（理解为ConnecionFactory）;SqlSessionFactoryBuilder()工具类中的（build方法）
		ssf = new SqlSessionFactoryBuilder().build(ips);
	
    	
    }
	public static SqlSession getSession(){
        
        return ssf.openSession();
	}

}
