package com.neuedu.test1;


/**
 * @author wqy
 * @version 1.0
 * @since 2019/8/8
 * 
 * */

public class People {

	// ���췽��
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
	// ���
	int pNo;
	// ����
	String name;
	// �Ա�
	char sex ;
	// ����
	short age;
	// �Ƿ����
	boolean isMarry;
	// ���֤��
	String idCard;
	//��ַ 
	String addRess;
	// �ֻ���
	String telNo;
	// ������
	String partnerName;
	
	//���
	public boolean marry(People anotherPeople) {
		// ��������22���꣬Ů��Ҫ��20����
		// ����δ��
		// �Ա�ͬ
		if(this.age>=(this.sex=='��'?22:20) && anotherPeople.age>=(anotherPeople.sex=='Ů'?20:22) ) {
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
