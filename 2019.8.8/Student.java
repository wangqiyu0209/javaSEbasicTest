package com.neuedu.test;

public class Student {

	public static void main(String[] args) {
		Student tom = new Student();
		boolean writeLog = tom.writeLog("�����Ǹ�������");
		System.out.print(writeLog==true?"Tomд��־��":"Tomû��д��־");
	}
	// ��������
	String name;
	short age;
	float height;
	float weight;
	char sex;
	
	//����
	public boolean writeLog(String log) {
		if(log==null) {
			return false;
		}else {
			return true;
		}
	}
}
