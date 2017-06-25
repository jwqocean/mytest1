package mybatis02;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.itheima.mapper.OrderMapper;
import cn.itheima.pojo.Orders;


public class MybatisMapperJunit {
	@Test
	public void testFindOrderAndUser() throws Exception{
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);
		//创建SqlSessionFactory工厂
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		OrderMapper mapper = openSession.getMapper(OrderMapper.class);
		List<Orders> list = mapper.findOrderAndUser();
		for (Orders order : list) {
			System.out.println(order);
		}
		openSession.close();
	}
}
