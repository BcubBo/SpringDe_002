package test;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import dao.ITestBiz;

public class Test {

	public static void main(String[] args) {

		
		
//		new TestBiz().testBiz();此时会报空指针的异常
		ApplicationContext appctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ITestBiz biz = (ITestBiz)appctx.getBean("testBiz");
		//获取bean
		//biz.init();
		biz.testBiz("测试JointPoint连接点信息class使用","hiThere");
		//new FileSystemXmlApplicationContext("");如果文件没有在src文件夹下
		
		
		Map<String,Object> map = new HashMap<String,Object>();
		//import java.util.Entry;
		Set<Entry<String,Object>> entry = map.entrySet();
		//打包发送回entrySets
		Iterator<Entry<String,Object>> it = entry.iterator();
		
		while(it.hasNext()) {
			
			Entry<String,Object> one = it.next();
			//迭代获取Entry对象
			one.getKey();
			//获取Entry对象的key
			one.getValue();
			//获取Entry对象的value
			
			
		}
		
	}

}