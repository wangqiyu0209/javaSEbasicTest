package com.neuedu.test1;
/**
 * @author wqy
 * @since 2019/8/8
 * @version 1.0
 * 
 * */
public class PersonCreate {

	// 成员变量
	String  name ;
	int age  ;
	double height ;
	
	public static void main(String[] args) {
		PersonCreate personCreate1 = new PersonCreate("zhangsan", 33, 1.73);
		PersonCreate personCreate2 = new PersonCreate("lishi", 44, 1.74);
		personCreate1.sayHello();
		personCreate2.sayHello();
	}

	// 构造方法
	public PersonCreate(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	private void sayHello() {
		System.out.println("hello, my name is"+" "+this.name);
	}
	
}
