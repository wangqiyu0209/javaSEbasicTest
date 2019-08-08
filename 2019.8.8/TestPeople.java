package com.neuedu.test1;

/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * 测试类
 * 
 * */

public class TestPeople {

	public static void main(String[] args) {
		People people = new People(001,"李四",'男',(short)30,false,"12321232332","空港","1234324342",null);
		People people1 = new People(002,"小红",'女',(short)22,false,"12200812732","空港","12343214349",null);
		Boolean marry = people.marry(people1);
		System.out.println(marry);
	};
}
