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

	public static void main(String[] args)  {

		
		
//		new TestBiz().testBiz();此时会报空指针的异常
		ApplicationContext appctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ITestBiz biz = (ITestBiz)appctx.getBean("testBiz");
		System.out.println("=========初始化完毕=========");
		//获取bean
		//biz.init();
		try {
			System.out.println(biz.testBiz("XXX","hiThere"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//new FileSystemXmlApplicationContext("");如果文件没有在src文件夹下
		
		

	}

}