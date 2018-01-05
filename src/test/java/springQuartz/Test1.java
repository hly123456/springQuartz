package springQuartz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试 
@ContextConfiguration(locations="classpath:applicationContext.xml") //加载配置文件  
public class Test1 {
	private Logger logger = LoggerFactory.getLogger(Test1.class);
	
	@Test
	public void demo(){
		logger.info("应用开始启动。。。");
	}
}
