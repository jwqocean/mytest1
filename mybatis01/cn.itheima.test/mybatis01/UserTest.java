package mybatis01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.itheima.pojo.User;



public class UserTest {
	@Test
	public void testFindUserById() throws Exception{
		String resource="SqlMapConfig.xml";
		//通过流将核心配置文件读取出来
		InputStream inputStream=Resources.getResourceAsStream(resource);
		//通过核心配置文件输入流来创建会话工厂
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
		//通过工厂创建会话
		SqlSession opSession=factory.openSession();
		User user = opSession.selectOne("test.findUserById", 1);
		System.out.println(user);
		opSession.close();
	}
	
	@Test
	public void testFindUserByUserName() throws Exception{
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		List<User> list = openSession.selectList("test.findUserByUserName", "王");
		System.out.println(list);
		openSession.close();	
	}
	
	@Test
	public void testInsertUser() throws Exception{
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		User user=new User();
		user.setUsername("哈哈");
		user.setBirthday(new Date());
		user.setSex("1");
		user.setAddress("北京昌平");
		System.out.println("====" + user.getId());
		openSession.insert("insertUser", user);
		openSession.commit();
		System.out.println("============="+user.getId());
	}
	
	@Test
	public void testDelUserById() throws Exception{
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		openSession.delete("test.delUserById", 28);
		//提交
		openSession.commit();
	}
	
	@Test
	public void testUpdateUserById() throws Exception{
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		SqlSessionFactory factory =new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		User user=new User();
		user.setId(27);
		user.setUsername("花花");
		openSession.update("test.updateUserById", user);
		openSession.commit();
	} 
}
