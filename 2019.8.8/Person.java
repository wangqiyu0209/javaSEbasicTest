package com.neuedu.test1;
/***
 * 
 * @author wqy
 * @since 2019/8/7
 * 
 * */

public class Person {

	// ����
	String name;
	// ���
	int  num;
	// �Ա�
	char sex;	
	// ����
	int age;
	// ���
	boolean married;
	// ���֤��
	long cardId;
	// ��ַ
	String address;
	// �绰
	int telephone;
	// ����
	Boolean partner;
	
	public static void main(String[] args) {
		
		Person p1 = new Person("xiaoming",12313,'��',23,true,1003211290,"����ж��������Ĺ�Ԣ",1231234121,false);
		Person p2 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.num);
     	System.out.println(p1.sex);
		System.out.println(p1.age);
		System.out.println(p1.cardId);
		System.out.println(p1.telephone);
		System.out.println(p1.partner);
	}
	
	// ���췽��
	public Person(String name,int num ,char sex,int age,boolean married,long cardId,String address,int telephone,Boolean partner) {
		this.name = name;	
		this.num = num;
		this.sex = sex;
		this.age = age;
		this.married = married;
		this.cardId = cardId;
		this.address = address;
		this.telephone = telephone;
		this.partner = partner;
	}
	
	public Person() {
		
	}
}
