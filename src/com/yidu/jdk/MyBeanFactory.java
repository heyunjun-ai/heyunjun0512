package com.yidu.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.yidu.dao.UserDao;
import com.yidu.dao.UserDaoImpl;

/**
 *@author:HYJ
 *@remark:MyBeanFactory.java
 *@createTime:2019年9月5日下午5:02:40
 *@version:1.0
 */
public class MyBeanFactory {
	public static UserDao getBean(){
		final UserDao userDao = new UserDaoImpl();
		
		final MyAspect myAspect =new MyAspect();
		
		return (UserDao) Proxy.newProxyInstance(
				MyBeanFactory.class.getClassLoader(), 
				new Class[] {UserDao.class},
				 new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						myAspect.myBefore();
						Object obj = method.invoke(userDao, args);
						myAspect.myAfter();
						return obj;
					}
				});
		}
}

