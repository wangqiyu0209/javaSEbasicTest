package com.neuedu.test1;
/**
 * @author wqy
 * @since 2019/8/8
 * @version 1.0
 * 
 * */

public class MacBook {

	// cpu型号
	String num;
	// 颜色
	String color;
	
	// 无参构造器
	public MacBook() {
		
	}
	// 有参构造器
	public MacBook(String num,String color) {
		this.num = num;
		this.color = color;
	}

	// 输出笔记本信息的方法
	public  String getInformation(String num ,String color) {
		System.out.println(num);
		return color;
	}
	
}
