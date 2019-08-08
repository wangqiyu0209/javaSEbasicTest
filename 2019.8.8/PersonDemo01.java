package com.neuedu.test1;
/**
 * @author wqy
 * @since 2019/8/8
 * @version 1.0
 * 
 * */
public class PersonDemo01 {

	String  name ;
	double height ;
	double weight ;
	
	public static void main(String[] args) {
		PersonDemo01 personDemo01 = new PersonDemo01("tom", 188, 50);
		personDemo01.sayHello();
	}
	// ¹¹ÔìÆ÷
	public PersonDemo01(String name,double height,double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void sayHello() {
		System.out.println("hello, my name is"+" "+this.name);
	}
	
}
