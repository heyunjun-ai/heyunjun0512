package com.yidu.jdk;

import org.junit.Test;

import com.yidu.dao.UserDao;

/**
 *@author:HYJ
 *@remark:TestJDK.java
 *@createTime:2019��9��5������5:08:41
 *@version:1.0
 */
public class TestJDK {
	@Test
	public void demo01(){
		//1.�ӹ������ָ��������
		UserDao userDao = MyBeanFactory.getBean();
		//2ִ�з���
		userDao.save();
		userDao.delete();
		userDao.find();
		userDao.update();
	}
}

