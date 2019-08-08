package com.neuedu.test1;


/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * 
 * */

public class People {

	// 构造方法
	public People(int pNo, String name, char sex, short age, boolean isMarry, String idCard, String addRess,
			String telNo, String partnerName) {
		super();
		this.pNo = pNo;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.isMarry = isMarry;
		this.idCard = idCard;
		this.addRess = addRess;
		this.telNo = telNo;
		this.partnerName = partnerName;
	}
	// 编号
	int pNo;
	// 姓名
	String name;
	// 性别
	char sex ;
	// 年龄
	short age;
	// 是否婚配
	boolean isMarry;
	// 身份证号
	String idCard;
	//地址 
	String addRess;
	// 手机号
	String telNo;
	// 伴侣名
	String partnerName;
	
	//结婚
	public boolean marry(People anotherPeople) {
		// 男性需满22周岁，女需要满20周岁
		// 都是未婚
		// 性别不同
		if(this.age>=(this.sex=='男'?22:20) && anotherPeople.age>=(anotherPeople.sex=='女'?20:22) ) {
			if(this.isMarry==false && anotherPeople.isMarry==false) {
				this.isMarry = true;
				anotherPeople.isMarry = true;
				this.partnerName = anotherPeople.name;
				anotherPeople.partnerName = this.name;
				return true;
			}
		}
		return false;
	}
}
