package com.neuedu.test1;

/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * ������
 * 
 * */

public class TestPeople {

	public static void main(String[] args) {
		People people = new People(001,"����",'��',(short)30,false,"12321232332","�ո�","1234324342",null);
		People people1 = new People(002,"С��",'Ů',(short)22,false,"12200812732","�ո�","12343214349",null);
		Boolean marry = people.marry(people1);
		System.out.println(marry);
	};
}
