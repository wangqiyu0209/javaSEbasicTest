package com.neuedu.test;

public class Student {

	public static void main(String[] args) {
		Student tom = new Student();
		boolean writeLog = tom.writeLog("今天是个好天气");
		System.out.print(writeLog==true?"Tom写日志了":"Tom没有写日志");
	}
	// 声明变量
	String name;
	short age;
	float height;
	float weight;
	char sex;
	
	//方法
	public boolean writeLog(String log) {
		if(log==null) {
			return false;
		}else {
			return true;
		}
	}
}
