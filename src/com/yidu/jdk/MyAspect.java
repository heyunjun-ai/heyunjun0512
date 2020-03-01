package com.yidu.jdk;
/**
 *@author:HYJ
 *@remark:MyAspect.java
 *@createTime:2019年9月5日下午5:00:30
 *@version:1.0
 */
public class MyAspect {
	public void myBefore(){
		System.out.println("方式执行前！");
	}
	
	public void myAfter(){
		System.out.println("方式执行后！");
	}
}

