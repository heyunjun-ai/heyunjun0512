package com.yidu.jdk;

import org.junit.Test;

import com.yidu.dao.UserDao;

/**
 *@author:HYJ
 *@remark:TestJDK.java
 *@createTime:2019年9月5日下午5:08:41
 *@version:1.0
 */
public class TestJDK {
	@Test
	public void demo01(){
		//1.从工厂获得指定的内容
		UserDao userDao = MyBeanFactory.getBean();
		//2执行方法
		userDao.save();
		userDao.delete();
		userDao.find();
		userDao.update();
	}
}

