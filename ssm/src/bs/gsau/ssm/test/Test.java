package bs.gsau.ssm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.ssm.mapper.ItemsMapperCustom;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

public class Test {

	private ApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-dao.xml");
	}

	@org.junit.Test
	public void test() throws Exception {
		ItemsMapperCustom itemMapperCustom =  (ItemsMapperCustom) applicationContext.getBean("itemsMapperCustom");
		ItemsQueryVo vo = new ItemsQueryVo();
		List<ItemsCustom> list = itemMapperCustom.findItemsList(vo);
		System.out.println(list);
	}

}
